package Leetcode;

//https://leetcode.com/problems/move-zeroes/ 
// Example 1:

// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]
public class moveZeroes {
    public void moveZeroes(int[] nums) {
        int i = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[i] = num; // nums[0]=1
                i++;
            }
        }
        // for printing 0's at end of array
        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }

    }
}
