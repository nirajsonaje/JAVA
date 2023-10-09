package patterns;
// Sample Input 0

import java.util.Scanner;

// 4
// Sample Output 0

//    ****
//   ****
//  ****
// ****
public class rhombuspattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
            nsp--;
        }
    }
}
