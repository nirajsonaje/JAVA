package array;

import java.util.Scanner;

public class updatequery225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int left = sc.nextInt();
        int right = sc.nextInt();
        int val = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (i >= left && i <= right) {
                arr[i] = val;
                System.out.print(arr[i] + " ");
            } else {
                System.out.print(arr[i] + " ");
            }

        }
    }
}
