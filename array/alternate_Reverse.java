package array;

import java.util.Scanner;

public class alternate_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        // O(n)
        for (int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }

        for (int i = arr.length - 1; i >= 0; i -= 2) {
            System.out.println(arr[i]);
        }

    }
}
