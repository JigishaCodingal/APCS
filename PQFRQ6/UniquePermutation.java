import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniquePermutation {

    // Set to store the unique permutations
    private Set<List<Integer>> ans = new HashSet<>();

    // Method to generate unique permutations of an int[] array
    public List<List<Integer>> permuteUnique(int[] nums) {
        // Start with an empty permutation
        List<Integer> curr = new ArrayList<>();
        helper(0, nums, curr);
        // Convert the set results to a list for return
        return new ArrayList<>(ans);
    }

    // Helper method to generate permutations using backtracking
    private void helper(int idx, int[] nums, List<Integer> curr) {
        // If the current permutation has the same length as input, store it
        if (curr.size() == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        // Iterate through the array to create permutations
        for (int i = 0; i < nums.length; i++) {
            // Skip duplicates: avoid reusing the same value at the same position
            if (curr.contains(nums[i]))
                continue;

            // Add current element to the permutation
            curr.add(nums[i]);

            // Recurse to build the next part
            helper(i + 1, nums, curr);

            // Backtrack: remove the last added element
            curr.remove(curr.size() - 1);
        }
    }

    // Swap method (not strictly needed for this approach but included to match the
    // screenshot)
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        // Example usage
        UniquePermutation solution = new UniquePermutation();
        int[] nums = { 1, 2, 3 };
        List<List<Integer>> result = solution.permuteUnique(nums);
        System.out.println(result);
    }
}