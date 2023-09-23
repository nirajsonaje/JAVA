// The problem requires a program to print multiples of 8,
// starting from a given value N down to 1. The value of N will be taken as input from the user.

import java.util.Scanner;

public class problem91 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = n; i > 1; i--) {
            if (i % 8 == 0) {
                System.out.print(i + " ");
            }

        }

    }
}
