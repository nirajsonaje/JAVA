package veryImportantquestion;

import java.util.Scanner;

// *****
// *   *
// *   *
// *****
public class pattern4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                if (j == 1 || j == columns || i == 1 || i == rows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
