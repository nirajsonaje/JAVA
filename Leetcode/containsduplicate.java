package Leetcode;
//https://leetcode.com/problems/contains-duplicate/description/
import java.util.Arrays;

public class containsduplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1])
                return true;
        }
        return false;
    }
}
