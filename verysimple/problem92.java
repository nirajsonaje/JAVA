package verysimple;
import java.util.Scanner;

public class problem92 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = n; i > 0; i -= 3) {
            System.out.println(i);

        }
    }
}
