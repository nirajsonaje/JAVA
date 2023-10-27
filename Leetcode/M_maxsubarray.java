package Leetcode;

//https://leetcode.com/problems/maximum-subarray/description/ 
//Kadane's algorithm, which is an efficient way to find the maximum subarray sum. 
public class M_maxsubarray {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0]; // Initialize the maximum sum with the first element
        int currentSum = nums[0]; // Initialize the current sum with the first element
        // -2
        // 1 -2+1
        for (int i = 1; i < nums.length; i++) {
            // Calculate the maximum of the current element and the current sum + current
            // element
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update the maximum sum if the current sum is greater
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
