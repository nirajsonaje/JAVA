package patterns;

import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int nsp = n - 1;
        for (int rows = 1; rows <= 2 * n - 1; rows++) {
            for (int sp = 1; sp <= nsp; sp++) {
                System.out.print(" ");
            }
            for (int str = 1; str <= nst; str++) {
                System.out.print("*");
            }
            System.out.println();
            if (rows < n) {
                nst += 2;
                nsp--;
            } else {
                nst -= 2;
                nsp++;
            }

        }

    }
}
