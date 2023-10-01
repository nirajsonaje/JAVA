package no_problems;

import java.util.Scanner;

public class xyzw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Read the number of digits
        int number = 0; // Initialize the number

        for (int i = 0; i < n; i++) {
            int digit = sc.nextInt(); // Read each digit
            number = number * 10 + digit; // Form the number by multiplying by 10 and adding the new digit
        }

        System.out.println(number); // Print the final number
    }
}
