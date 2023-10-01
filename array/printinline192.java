package array;

import java.util.Scanner;

public class printinline192 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();

            System.out.println(arr[i] = num);
        }

    }
}
