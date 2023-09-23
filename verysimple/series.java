package verysimple;
import java.util.Scanner;

public class series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int k = scanner.nextInt();

        while (n > 0) {
            System.out.print(n + " ");
            n -= 3 * k;
        }
    }
}
