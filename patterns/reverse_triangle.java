package patterns;
import java.util.Scanner;

public class reverse_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(5 * j + " ");
            }
            System.out.println();
        }

    }
}
