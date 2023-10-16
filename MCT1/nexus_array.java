package MCT1;

import java.util.Scanner;

public class nexus_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = ans[i + n] = arr[i];
        }

        for (int i = 0; i < 2 * n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
