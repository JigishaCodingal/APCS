import java.util.Scanner;

public class ACPColumnWithMinZeros {

    // Method to get the column with the minimum number of zeros from a 2D array
    public static int[] getColumnWithMinZeros(int[][] array2D) {
        int rows = array2D.length;
        int cols = array2D[0].length;

        int minZeroCount = Integer.MAX_VALUE;
        int minColIndex = 0;

        // Loop through all columns in the 2D array
        for (int j = 0; j < cols; j++) {
            int zeroCount = 0;

            // Count zeros in the current column
            for (int i = 0; i < rows; i++) {
                if (array2D[i][j] == 0) {
                    zeroCount++;
                }
            }

            // If the current column has fewer zeros, update
            if (zeroCount < minZeroCount) {
                minZeroCount = zeroCount;
                minColIndex = j;
            }
        }

        // Extract that column into a new array
        int[] minZeroColumn = new int[rows];
        for (int i = 0; i < rows; i++) {
            minZeroColumn[i] = array2D[i][minColIndex];
        }

        return minZeroColumn;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Read number of rows and columns
            System.out.print("Enter the number of rows in the array: ");
            int rows = sc.nextInt();
            System.out.print("Enter the number of columns in the array: ");
            int cols = sc.nextInt();

            // Create the 2D array and fill it with user input
            int[][] array2D = new int[rows][cols];
            System.out.println("Enter the elements of the 2D array:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    array2D[i][j] = sc.nextInt();
                }
            }

            // Get the column with the minimum number of zeros
            int[] minZeroColumn = getColumnWithMinZeros(array2D);

            // Count zeros in that column for display
            int zeroCount = 0;
            for (int val : minZeroColumn) {
                if (val == 0)
                    zeroCount++;
            }

            // Print the column with the minimum zeros
            System.out.print("The column with the minimum number of zeros is: ");
            for (int k = 0; k < minZeroColumn.length; k++) {
                if (k > 0)
                    System.out.print(" ");
                System.out.print(minZeroColumn[k]);
            }
            System.out.println();

            System.out.println("The number of zeros in that column is: " + zeroCount);
        }
    }
}
