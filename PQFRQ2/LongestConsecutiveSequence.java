import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class LongestConsecutiveSequence {

    // Method to find the length of the longest consecutive sequence
    public int findLongestConsecutiveSequence(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int maxLength = 0;

        for (int num : set) {
            // Only start counting if 'num' is the start of a sequence
            if (!set.contains(num - 1)) {
                int current = num;
                int length = 1;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                if (length > maxLength) {
                    maxLength = length;
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Ask for number of elements
            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();

            // Read array elements
            int[] arr = new int[n];
            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Compute longest consecutive sequence length
            LongestConsecutiveSequence obj = new LongestConsecutiveSequence();
            int result = obj.findLongestConsecutiveSequence(arr);

            // Print the result
            System.out.println("The length of the longest consecutive sequence is: " + result);
        }
    }
}