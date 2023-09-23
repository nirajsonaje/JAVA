package patterns;

import java.util.Scanner;

public class bigladdder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int r = sc.nextInt();

        for (int rows = 1; rows <= r; rows++) {
            for (int col = 1; col <= c; col++) {
                if (rows == r || col == c || rows == 1 || col == 1 || rows % 3 == 1) {
                    System.out.print("* ");
                }

                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
