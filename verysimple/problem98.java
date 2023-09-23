//Given a integer n, print all even numbers from 0 till n (including, if even)

import java.util.Scanner;

public class problem98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
