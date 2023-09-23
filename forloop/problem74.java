package forloop;
// Given a number n, print all integers in range 1 to n.

// You can assume that input is a positive integer

import java.util.Scanner;

public class problem74 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

    }
}
