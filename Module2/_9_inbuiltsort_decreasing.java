import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class _9_inbuiltsort_decreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        Integer arr[] = new Integer[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr, Collections.reverseOrder());
        // Arrays.sort(arr, (a, b) -> a - b);// increasing order
        // Arrays.sort(arr, (a, b) -> b - a);// decreasing order
        for (int i = 0; i < n; i++)
            System.out.println(arr[i]);
    }
}
