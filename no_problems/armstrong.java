package no_problems;

import java.util.Scanner;

public class armstrong {

    public static boolean isArmstrong(int n) {
        int originalNumber = n;
        int sum = 0;

        while (n >= 1) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }

        return sum == originalNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int t = 1; t <= T; t++) {

            int n = scanner.nextInt();

            boolean isArmstrongNumber = isArmstrong(n);
            System.out.println(isArmstrongNumber);
        }

    }
}
