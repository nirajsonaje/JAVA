package Leetcode;

public class twosum {

    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        // Return an empty array if no solution is found (this should not happen per the
        // problem statement)
        return new int[] {};
    }
}
