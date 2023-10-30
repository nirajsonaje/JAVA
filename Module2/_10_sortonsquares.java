import java.util.Arrays;
import java.util.Scanner;

public class _10_sortonsquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer arr[] = new Integer[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr, (a, b) -> a * a - b * b);
        for (int i = 0; i < n; i++)
            System.out.println(arr[i]);
    }
}
