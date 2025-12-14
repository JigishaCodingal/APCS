import java.util.Scanner;
public class SpiralArray {
    // Main method - Entry point of the program
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scn = new Scanner(System.in);
        // Ask the user to enter the number of rows (n) and columns (m)
        System.out.print("Enter the number of rows: ");
         int n = scn.nextInt();

        System.out.print("Enter the number of columns: ");
        int m = scn.nextInt();

        // Handle case where array dimensions are 0
        if (n <= 0 || m <= 0) {
            System.out.println("Array dimensions cannot be zero.");
            return;
        }

        // Create a 2D array to store the elements
        int[][] arr = new int[n][m];

        // Ask the user to enter the elements of the 2D array
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt(); // Store each element in the array
            }
        }
        // Initialize boundaries for the spiral traversal
        int minRow = 0, maxRow = n - 1;
        int minCol = 0, maxCol = m - 1;
        int count = 0;

        // Start the spiral traversal
        System.out.println("Spiral order traversal of the array:");
        while (minRow <= maxRow && minCol <= maxCol) {

            // Traverse the top row (left to right)
            for (int col = minCol; col <= maxCol; col++) {
                System.out.print(arr[minRow][col] + " ");
                count++;
            }
            minRow++;

            // Traverse the right column (top to bottom)
            for (int row = minRow; row <= maxRow; row++) {
                System.out.print(arr[row][maxCol] + " ");
                count++;
            }
            maxCol--;

            // Traverse the bottom row (right to left)
            if (minRow <= maxRow) {
                for (int col = maxCol; col >= minCol; col--) {
                    System.out.print(arr[maxRow][col] + " ");
                    count++;
                }
                maxRow--;
            }

            // Traverse the left column (bottom to top)
            if (minCol <= maxCol) {
                for (int row = maxRow; row >= minRow; row--) {
                    System.out.print(arr[row][minCol] + " ");
                    count++;
                }
                minCol++;
            }
        }

        System.out.println(); // newline after traversal
    }
}