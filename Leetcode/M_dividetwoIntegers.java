package Leetcode;

//https://leetcode.com/problems/divide-two-integers/description/
public class M_dividetwoIntegers {
    class Solution {
        public int divide(int dividend, int divisor) {
            long ans = (long) dividend / divisor;
            if (ans > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            else if (ans < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            else
                return (int) ans;
        }
    }
}
// Let's use an example to explain how this code works. Suppose we want to
// divide dividend = 10 by divisor = 3.

// The code begins by converting dividend and divisor to long to avoid potential
// overflow during division. So, in our example, both dividend and divisor are
// already integers, but they are cast to long to perform the division safely.

// The division itself is done in this line: long ans = (long) dividend /
// divisor;. In this case, ans will be set to 10 / 3, which is approximately
// 3.3333.

// The code then checks if the value in ans is within the range of a 32-bit
// signed integer. If it's greater than Integer.MAX_VALUE (which is the maximum
// value a 32-bit signed integer can hold) or less than Integer.MIN_VALUE (the
// minimum value), it returns Integer.MAX_VALUE or Integer.MIN_VALUE,
// respectively. This check is necessary to prevent overflow or underflow in the
// final result.

// In our example, ans is approximately 3.3333, which is less than
// Integer.MAX_VALUE. It's also greater than Integer.MIN_VALUE. Therefore, it's
// a valid value.

// Finally, the code casts ans back to an int and returns it. In our example,
// this will result in 3, which is the integer part of the division of 10 by 3.

// This code correctly performs integer division, handles potential
// overflow/underflow, and returns the result as a 32-bit signed integer.