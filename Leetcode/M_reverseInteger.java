package Leetcode;
//https://leetcode.com/problems/reverse-integer/description/
public class M_reverseInteger {
    public int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int digit = x % 10; // Get the last digit of x.
            x /= 10; // Remove the last digit from x.

            // Check for potential overflow before updating the result.
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            result = result * 10 + digit; // Append the digit to the result.
        }

        return result;
    }
}
