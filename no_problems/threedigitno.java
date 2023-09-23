package no_problems;

import java.util.Scanner;

public class threedigitno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Three-digit positive number
        int number = scanner.nextInt();

        // Extract and print the digits from right to left
        int onesPlace = number % 10;
        int tensPlace = (number / 10) % 10;
        int hundredsPlace = number / 100;

        System.out.println(onesPlace);
        System.out.println(tensPlace);
        System.out.println(hundredsPlace);
    }
}
