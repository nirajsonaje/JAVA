package Leetcode;

//https://leetcode.com/problems/add-digits/description/
public class add_digits {
    public static void main(String[] args) {
        int num = 38;
        while (num >= 10) {
            int sumDigits = 0;
            while (num > 0) {
                sumDigits += num % 10;
                num /= 10;
            }
            num = sumDigits;
        }
        System.out.println(num);
    }
}
