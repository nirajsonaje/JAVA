package patterns;

import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int rows = 1; rows <= n; rows++) {
            for (int space = 1; space <= n - rows; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= rows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
