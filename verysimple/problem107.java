import java.util.Scanner;

public class problem107 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int x = 1;
        while (x < n) {
            System.out.print(x + " ");
            x *= 2;
        }

    }
}
