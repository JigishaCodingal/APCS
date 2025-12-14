import java.util.Arrays;

public class ACPMedianCalculator {

    // Returns the median of the given array of integers.
    // If length is odd -> middle element after sorting
    // If length is even -> average of the two middle elements
    public static double findMedian(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);

        int n = copy.length;
        if ((n & 1) == 1) { // odd
            return copy[n / 2];
        } else { // even
            int mid1 = copy[(n / 2) - 1];
            int mid2 = copy[n / 2];
            return (mid1 + mid2) / 2.0; // ensure double result for average
        }
    }

    // Example usage
    public static void main(String[] args) {
        int[] a1 = { 3, 1, 4, 2, 5 }; // odd -> median 3
        int[] a2 = { 7, 1, 3, 5 }; // even -> median (3+5)/2 = 4.0

        System.out.println("Median of a1: " + findMedian(a1)); // 3.0
        System.out.println("Median of a2: " + findMedian(a2)); // 4.0
    }
}