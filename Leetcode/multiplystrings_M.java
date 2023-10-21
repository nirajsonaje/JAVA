package Leetcode;

//https://leetcode.com/problems/multiply-strings/description/
public class multiplystrings_M {
    public String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        int[] result = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {
            int x = num1.charAt(i) - '0';
            for (int j = n - 1; j >= 0; j--) {
                int y = num2.charAt(j) - '0';
                result[i + j + 1] += x * y;
            }
        }

        int carry = 0;
        for (int i = m + n - 1; i >= 0; i--) {
            int temp = (result[i] + carry) % 10;
            carry = (result[i] + carry) / 10;
            result[i] = temp;
        }

        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) {
                sb.append(num);
            }
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
