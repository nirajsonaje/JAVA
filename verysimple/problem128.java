package verysimple;
import java.util.Scanner;

public class problem128 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= n; i++) {
            int in = sc.nextInt();
            result *= in;
            System.out.println(result);
        }
    }
}
