package array;

import java.util.Scanner;

public class repeatingmissing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == arr[i + 1]) {

                System.out.print(arr[i] + " ");
                break;

            }

        }
        for (int j = 0; j < arr.length - 1; j++) {
            if ((j + 1) != arr[j]) {// 1

                System.out.print((j + 1) + " ");
                break;
            }
        }
    }
}
