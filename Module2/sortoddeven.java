import java.util.Arrays;
import java.util.Scanner;

import patterns.reverse_triangle;

public class sortoddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer arr[] = new Integer[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr, (a, b) -> {
            if ((a + b) % 2 == 0) // both are odd or both are even sort in increasing
                return a - b;
            else if (a % 2 == 0) // 1st even and 2nd odd -> no swap
                return -1;
            else
                return +1; // 1st odd and 2nd evem -> swap
        });
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
