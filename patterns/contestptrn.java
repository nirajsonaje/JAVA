package patterns;

import java.util.Scanner;

public class contestptrn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int nsp = n - 1;
        for (int i = 1; i <= n; i++) {
            for (int sp = 1; sp <= nsp; sp++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(k * j + " ");
            }
            System.out.println();
            nsp--;
        }
    }
}
