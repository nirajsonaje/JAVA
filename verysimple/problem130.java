import java.util.Scanner;

public class problem130 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 1;
        int i = 0;
        while (i < n) {

            result = result * 10;
            i++;
        }
        System.out.println(result);

    }
}
