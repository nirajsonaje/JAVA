package patterns;
// 5
// *       *       *       *       *
//         *       *       *
//                 *
//         *       *       *
// *       *       *       *       *
import java.util.Scanner;

public class dumroo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number n
        int n = scanner.nextInt();
        int nsp = 0;
        int nstr = n;
        for (int rows = 1; rows <= n; rows++) {

            for (int sp = 1; sp <= nsp; sp++) {
                System.out.print("\t");

            }
            for (int str = 1; str <= nstr; str++) {
                System.out.print("*\t");

            }

            System.out.println();
            if (rows <= n / 2) {
                nsp++;
                nstr -= 2;
            } else {
                nstr += 2;
                nsp -= 1;
            }
        }

    }
}
