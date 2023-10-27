package Leetcode;

public class H_number_of_digit_one_H {
    // [0..9] there has only one '1' : 1
    // [0..99] 20 = 10 * 1 + 10
    // [0..999] : 300 = 10 * 20 + 100
    // [0..9999]: 4000 = 10 * 300 + 1000

    // 342 >>> [2] 1 + [40] 4 * 1 + 10 + [300] 3 * 20 + 100 >>> 1 + 14 + 160 >>> 175
    // 312 >>> [2] 1 + [10] 1 * 1 + Math.min(10, 12-9) + [300] 3 * 20 + 100 >>> 1 +
    // 4 + 160 >>> 165

    // Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of
    // Digit One.
    // Memory Usage: 40.1 MB, less than 84.55% of Java online submissions for Number
    // of Digit One.
    // Time: O(log(N)); Space:O(1)
    public int countDigitOne(int num) {
        if (num == 0)
            return 0;
        // 13
        int count = 0;
        int a = 0, b = 1;

        while (num / b > 0) {// 13>0
            int m = (num / b) % 10; // 3
            if (m > 0)// 3>0
                count += m * a + Math.min(b, num % (b * 10) - (b - 1));

            a = 10 * a + b;
            b *= 10;
        }
        return count;
    }
}
