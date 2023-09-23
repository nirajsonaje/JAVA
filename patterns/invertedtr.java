package patterns;

import java.util.Scanner;

public class invertedtr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = 0;
        int nstr = n;
        for (int rows = 1; rows <= n; rows++) {
            // if (rows % 2 == 1) {
            for (int sp = 1; sp <= nsp; sp++) {
                System.out.print("\t");

            }
            for (int str = 1; str <= nstr; str++) {
                System.out.print("*\t");

            }

            nsp++;
            nstr -= 2;

            System.out.println();
        }

    }
}
