package no_problems;

import java.util.Scanner;

public class unique_prime {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

        // Input: Whole number N
        System.out.print("Enter a whole number N: ");
        int N = scanner.nextInt();

        // Find and print unique prime factors of N
        int divisor = 2;

        while (N > 1) {
            if (N % divisor == 0) {
                System.out.println(divisor);
                while (N % divisor == 0) {
                    N /= divisor;
                }
            }
            divisor++;
        }

    }
}
