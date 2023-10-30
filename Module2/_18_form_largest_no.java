import java.util.Arrays;
import java.util.Scanner;

public class _18_form_largest_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer arr[] = new Integer[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr, (a, b) -> {
            String x = "" + a + b;
            String y = "" + b + a;
            return x.compareTo(y);
        });
        for (int i = n - 1; i >= 0; i--)
            System.out.print(arr[i]);

    }
}
