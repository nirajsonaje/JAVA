package patterns;

import java.util.Scanner;

public class vpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nsp = 0;

        int nsp1 = n - 2;
        for (int rows = 1; rows <= n; rows += 2) {
            if (rows % 2 == 1) {
                for (int sp = 1; sp <= nsp; sp++) {
                    System.out.print("\t");

                }

                System.out.print("*\t");
                for (int sp = 1; sp <= nsp1; sp++) {
                    System.out.print("\t");

                }
                if (rows < n) {
                    System.out.print("*");
                }

                System.out.println();
                nsp++;
                nsp1 -= 2;

            } else {
                System.out.println();
            }

        }

    }
}
