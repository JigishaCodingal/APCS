import java.util.Scanner;

public class NonZeroRow {

    // Method to check if the given row is non-zero (all elements > 0)
    // Note: If you want "non-zero" to mean "no element equals 0", you can adjust accordingly.
    public static boolean isNonZeroRow(int rowIndex, int[][] array2D) {
        // Iterate through the specified row
        for (int i = 0; i < array2D[rowIndex].length; i++) {
            // If any element is zero, return false
            if (array2D[rowIndex][i] == 0) {
                return false;
            }
        }
        // If no element is zero, the row is non-zero
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the dimensions of the 2D array
        System.out.print("Enter the number of rows in the array: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns in the array: ");
        int cols = scanner.nextInt();

        // Create a 2D array based on user input
        int[][] array2D = new int[rows][cols];

        // Ask the user to input the elements of the 2D array
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array2D[i][j] = scanner.nextInt();
            }
        }

        // Ask the user to input the row index to check
        System.out.print("Enter the row index to check (0-based): ");
        int rowIndex = scanner.nextInt();

        // Check if the specified row is non-zero
        boolean result = false;
        if (rowIndex >= 0 && rowIndex < rows) {
            result = isNonZeroRow(rowIndex, array2D);
        } else {
            System.out.println("Invalid row index.");
            scanner.close();
            return;
        }

        // Display the result
        if (result) {
            System.out.println("Row " + rowIndex + " is a non-zero row.");
        } else {
            System.out.println("Row " + rowIndex + " contains zero(s).");
        }

        scanner.close();
    }
}