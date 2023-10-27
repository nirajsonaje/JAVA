package Leetcode;

//https://leetcode.com/problems/majority-element/description/
public class E_majority_element {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == candidate) {
                count++;
            } else if (count == 0) {
                candidate = nums[i];
                count = 1;
            } else {
                count--;
            }
        }

        return candidate;
    }
}
// int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4};
// Initial candidate: 3
// Initial count: 1
// nums[1] = 3, which is equal to the current candidate. Increment count: 2.

// nums[2] = 4, which is not equal to the current candidate. Since the count is
// not 0, decrement //count: 1.

// nums[3] = 2, which is not equal to the current candidate. Since the count is
// not 0, decrement count: 0. Update candidate to 2 and count to 1.

// nums[4] = 4, which is not equal to the current candidate. Since the count is
// not 0, decrement count: 0. Update candidate to 4 and count to 1.

// nums[5] = 4, which is equal to the current candidate. Increment count: 2.

// nums[6] = 2, which is not equal to the current candidate. Since the count is
// not 0, decrement count: 1.

// nums[7] = 4, which is not equal to the current candidate. Since the count is
// not 0, decrement count: 0. Update candidate to 4 and count to 1.

// nums[8] = 4, which is equal to the current candidate. Increment count: 2.
// The code finishes iterating through the array, and the final candidate is 4.
// It returns 4 as the majority element.