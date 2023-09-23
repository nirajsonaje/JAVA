import java.util.Scanner;

public class problem140 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int m = sc.nextInt();
        int add =3*k;
        for (int i = n; i >= m; i -= add) {
            System.out.print(i + " ");
        }
    }
}
