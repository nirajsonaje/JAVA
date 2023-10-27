package Leetcode;
// Example 1:

// Input: s = ["h","e","l","l","o"]
// Output: ["o","l","l","e","h"]
//https://leetcode.com/problems/reverse-string/description/
public class E_reverseString {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            // Swap characters at the left and right pointers
            char temp = s[left];// h
            s[left] = s[right];// o
            s[right] = temp;// h

            // Move the pointers towards the center of the string
            left++;
            right--;
        }
    }
}
