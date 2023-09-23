import java.util.Scanner;

public class problem114 {
    public static void main(String[] args) {
//For example, if the series of integers is 3, 4, 5, 6 the output should be 3, 7, 12, 18
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();

            sum += x;
            System.out.print(sum + " ");
        }

    }
}