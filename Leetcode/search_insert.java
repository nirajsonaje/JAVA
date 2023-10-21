package Leetcode;

//https://leetcode.com/problems/search-insert-position/
public class search_insert {
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] == target) {
                    return mid;
                }
                if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return left;
        }
    }
}
// Approach
// To solve this problem, I employ the binary search algorithm.
// Binary search provides an efficient way to locate or insert a target value
// within a sorted array.
// Below is an explanation with steps:

// Begin with two pointers, left and right,
// where left points to the start of the array, and right points to the end of
// the array.

// Initiate a loop and use these pointers, left and right, to define a search
// range within the array.

// Calculate the midpoint, mid, of the search range as mid = left + (right -
// left) / 2.

// Compare the element at index mid with the target:

// If the element at mid is equal to the target, return mid as the index where
// the target is found.
// If the element at mid is less than the target, update left to mid + 1 to
// search in the right half of
// the current range.
// If the element at mid is greater than the target, update right to mid - 1 to
// search in the left
// half of the current range.
// Repeat steps 3 and 4 until left is less than or equal to right.
// This ensures that the search range narrows down with each iteration.

// When the loop exits, return the value of left as the index where the target
// should be inserted. This is because left points to the first element that is
// greater than or equal to the target.

// Complexity
// Time complexity: O(log n)
// The binary search algorithm reduces the search space by half with each
// iteration,
// resulting in a time complexity of O(log n), where n is the number of elements
// in the array.

// Space complexity: O(1)
// The algorithm uses a constant amount of additional memory space for
// variables,
// making its space complexity constant.