package veryImportantquestion;

import java.util.Scanner;

//     *
//    **
//   ***
//  ****
// *****
public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n - 1;
        int nstr = 1;
        for (int i = 1; i <= n; i++) {
            for (int sp = 1; sp <= nsp; sp++) {
                System.out.print(" ");
            }
            for (int str = 1; str <= nstr; str++) {
                System.out.print("*");
            }
            nsp--;
            nstr++;
            System.out.println();
        }
    }
}
