package Leetcode;

//https://leetcode.com/problems/add-digits/description/
public class add_digits {
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
