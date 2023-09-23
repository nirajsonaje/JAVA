package patterns;
import java.util.Scanner;

public class no_ptrn_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int n = sc.nextInt();
        int nsp=r-1;
        for (int i = 1; i <=r; i++) {

            for (int sp = 1; sp<=nsp; sp++) {
                     System.out.print("   ");
            }
            for (int col = n; col<=n*i; col+=n) {
                     System.out.print(col+" ");
            }
                System.out.println();
                nsp--;
        }
    }
}
