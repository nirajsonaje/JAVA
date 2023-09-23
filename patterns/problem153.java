package patterns;

import java.util.Scanner;

public class problem153 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int columns = scanner.nextInt();
        int rows = scanner.nextInt();

        for (int i = 1; i <= columns; i++) {
            for (int j = 1; j <= rows; j++) {
                // Print '*' for the first row, last row, first column, and last column
                if (i == 1 || i == columns || j == 1 || j == rows) {
                    System.out.print("*");
                } else {
                    // Print space for other positions
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next row
        }

    }
}
