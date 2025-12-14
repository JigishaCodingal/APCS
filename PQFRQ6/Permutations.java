import java.util.ArrayList;
import java.util.List;

public class Permutations {

    // List to store the final permutations
    List<List<Integer>> ans = new ArrayList<>();

    // Main method to generate permutations of the input array
    public List<List<Integer>> permute(int[] nums) {
        // Initialize with an empty permutation
        helper(0, nums, new ArrayList<Integer>());
        return ans;
    }

    // Helper function to generate permutations using backtracking
    private void helper(int idx, int[] currArr, List<Integer> currPerm) {
        // If the current permutation length equals input length, store it
        if (currPerm.size() == currArr.length) {
            ans.add(new ArrayList<>(currPerm));
            return;
        }

        // Iterate through the array to create permutations
        for (int i = 0; i < currArr.length; i++) {
            // If the current element is already used in this permutation, skip it
            if (currPerm.contains(currArr[i])) {
                continue;
            }

            // Add the current element to the permutation
            currPerm.add(currArr[i]);

            // Recurse to fill the next position
            helper(i + 1, currArr, currPerm);

            // Backtrack: remove the last added element
            currPerm.remove(currPerm.size() - 1);
        }
    }

    // Optional: a swap-based approach for permutations (kept for reference)
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        // Example usage
        Permutations solution = new Permutations();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = solution.permute(nums);
        System.out.println(result);
    }
}