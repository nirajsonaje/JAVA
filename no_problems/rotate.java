package no_problems;

import java.util.Scanner;

public class rotate{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of test cases (T)
        int T = scanner.nextInt();

        for (int t = 1; t <= T; t++) {
            // Input: 7-digit number
            int number = scanner.nextInt();

            // Rotate the last 3 digits to the beginning
            int last3Digits = number % 1000;
            int remainingDigits = number / 1000;

            // Output: Print the rotated number
            int rotatedNumber = (last3Digits * 10000) + remainingDigits;
            System.out.println(rotatedNumber);
        }
    }
}