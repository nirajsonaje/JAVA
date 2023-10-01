package no_problems;

import java.util.Scanner;

public class gcd {
    public static int findGCD(int x, int y) {
        while (x != y) {
            if (x > y) {
                x -= y;
            } else {
                y -= x;
            }
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of test cases
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            // Input: Two integers x and y
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            // Calculate and print the GCD of x and y
            int gcd = findGCD(x, y);
            System.out.println(gcd);
        }
    }
}
