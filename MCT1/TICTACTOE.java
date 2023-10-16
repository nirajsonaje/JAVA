package MCT1;

import java.util.Scanner;

public class TICTACTOE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Print the pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1) {
                    System.out.print("x");
                } else {
                    System.out.print("o");
                }
            }
            System.out.println();
        }

    }
}
