package Leetcode;

// Example 1:
// Input: num = 38
// Output: 2
// Explanation: The process is
// 38 --> 3 + 8 --> 11
// 11 --> 1 + 1 --> 2 
// Since 2 has only one digit, return it.
//https://leetcode.com/problems/add-digits/description/
public class E_add_digits {
    public static int addDigits(int num) {
        // no less than 10 will have same ans
        while (num >= 10) {
            int sumDigits = 0;
            while (num > 0) {
                sumDigits += num % 10;
                num /= 10;
            }
            num = sumDigits;
        }
        return num;
    }
}
