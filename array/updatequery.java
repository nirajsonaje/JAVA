package array;

import java.util.Scanner;

public class updatequery {
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
        for (int i = 0; i <= left; i++) {
            System.out.print((arr[i] + val) + " ");
        }
        System.out.print(arr[right] + " ");
        for (int i = right + 1; i < arr.length; i++) {
            System.out.print((arr[i] + val) + " ");
        }
    }
}
