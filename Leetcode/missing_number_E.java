package Leetcode;

//https://leetcode.com/problems/missing-number/description/
// Approach
// The steps are as follows:
// We will first calculate the summation of first N natural numbers(i.e. 1 to N) 
//using the specified formula.
// Then we will add all the array elements using a loop.
// Finally, we will consider the difference between the summation of the first N natural numbers 
//and the sum of the array elements.
public class missing_number_E {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = n * (n + 1) / 2;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
        }
        return totalSum - sum;
    }
}
