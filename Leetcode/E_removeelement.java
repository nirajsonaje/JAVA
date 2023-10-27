package Leetcode;

//https://leetcode.com/problems/remove-element/submissions/ 
public class E_removeelement {
    public static int removeElement(int[] nums, int val) {

        int k = 0; // Initialize k to 0, which will represent the count of elements not equal to
                   // val.

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                // If the current element is not equal to val, copy it to the k-th position and
                // increment k.
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 4, 5, 2 };
        int val = 2;
        int x = removeElement(nums, val);
        System.out.println(x);
    }
}
