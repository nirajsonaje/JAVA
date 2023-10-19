package Leetcode;
// Intuition of this Problem:

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Set is used to prevent duplicate triplets and 
//parallely we will use two pointer approach to maintain J and k.

// NOTE - PLEASE READ APPROACH FIRST THEN SEE THE CODE. 
//YOU WILL DEFINITELY UNDERSTAND THE CODE LINE BY LINE AFTER SEEING THE APPROACH.

// Approach for this Problem:
// Sort the input array
// Initialize a set to store the unique triplets and an output vector to store the final result
// Iterate through the array with a variable i, starting from index 0.
// Initialize two pointers, j and k, with j starting at i+1 and k starting at the end of the array.
// In the while loop, check if the sum of nums[i], nums[j], and nums[k] is equal to 0. 
//If it is, insert the triplet into the set and increment j and decrement k to move the pointers.
// If the sum is less than 0, increment j. If the sum is greater than 0, decrement k.
// After the while loop, iterate through the set and add each triplet to the output vector.
// Return the output vector
//https://leetcode.com/problems/3sum/description/ 
// Example 1:

// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]
public class threesum {
    public List<List<Integer>> threeSum(int[] nums) {
        int target = 0;
        Arrays.sort(nums);
        Set<List<Integer>> s = new HashSet<>();// Set is used to prevent duplicate triplets a
        List<List<Integer>> output = new ArrayList<>();// output pairs
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;//1
            int k = nums.length - 1;//last element 
            while (j < k) {  //1<5
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target) {
                    s.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if (sum < target) { //<0
                    j++;
                } else {
                    k--;
                }
            }
        }
        output.addAll(s);
        return output;
    }
}
