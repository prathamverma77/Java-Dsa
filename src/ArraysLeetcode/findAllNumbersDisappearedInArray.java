package ArraysLeetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Remove 'public' keyword - now it can be in any file
class findDisappearedNumbers {

    // Method to find all missing numbers (LeetCode 448)
    static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;

        // Marking phase - use array itself as marker
        for (int index = 0; index < n; index++) {
            int value = Math.abs(nums[index]);
            int position = value - 1;
            if (nums[position] > 0) {
                nums[position] = -nums[position];
            }
        }

        // Find missing numbers - positive values indicate missing
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                int valueAtThisIndex = i + 1;
                ans.add(valueAtThisIndex);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // Test cases here...
        int[] test = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println("Missing numbers: " + findDisappearedNumbers(test));
    }
}