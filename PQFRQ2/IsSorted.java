import java.util.Scanner;

public class IsSorted {

    // Method to check if the array is sorted in ascending order
    public boolean isSorted(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return true;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Ask the user to input the number of elements
            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();

            // Create an array to store the input elements
            int[] arr = new int[n];

            // Read the array elements from the user
            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Create an object of IsSorted and call isSorted
            IsSorted obj = new IsSorted();
            boolean result = obj.isSorted(arr);

            // Print whether the array is sorted or not
            if (result) {
                System.out.println("The array is sorted.");
            } else {
                System.out.println("The array is not sorted.");
            }
        }
    }
}