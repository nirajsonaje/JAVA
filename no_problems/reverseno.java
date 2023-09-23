package no_problems;

import java.util.Scanner;

public class reverseno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of digits
        int n = scanner.nextInt();

        // Input: Read n digits and form the number
        int number = 0;
        for (int i = 0; i < n; i++) {
            int digit = scanner.nextInt();
            number = number * 10 + digit;
        }

        // Print the number formed
        System.out.println(number);
        // Reverse the number
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        // Print the reversed number
        System.out.println(reversedNumber);
    }
}
