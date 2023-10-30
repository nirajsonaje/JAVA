package no_problems;

import java.util.Scanner;

public class counts_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int totaldigit = 0;
        while (n > 0) {
            int digit = n % 10;
            totaldigit++;
            n /= 10;
        }
    }
}
