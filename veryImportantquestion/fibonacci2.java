package veryImportantquestion;

import java.util.Scanner;

public class fibonacci2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ptr1 = 0;
        int ptr2 = 1;
        int ptr3 = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(ptr1 + " ");
            }
            ptr3 = ptr1 + ptr2;
            ptr1 = ptr2;
            ptr2 = ptr3;

        }
    }

}
