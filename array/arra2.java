package array;

import java.util.Scanner;

public class arra2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }
        for (int i = 0; i < arr.length; i += 2) {
            System.out.println(arr[i]);
        }   

    }
}
