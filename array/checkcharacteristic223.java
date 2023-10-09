package array;

import java.util.Scanner;

public class checkcharacteristic223 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.print("-1"+" ");
            } else if (arr[i] == 0) {
                System.out.print("0"+" ");

            } else if (arr[i] > 0) {
                System.out.print("1"+" ");

            }

        }
    }
}
