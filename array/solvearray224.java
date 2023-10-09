package array;

import java.util.Scanner;

public class solvearray224 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int index[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            index[i] = sc.nextInt();
        }

        int target[] = new int[n];
        for (int i = 0; i < n; i++) {
            target[index[i]] = arr[i];
        }
        for (int i = 0; i < target.length; i++) {
            System.out.println(target[i] + " ");
        }

    }
}