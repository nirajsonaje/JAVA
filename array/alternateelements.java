package array;

import java.util.Scanner;

public class alternateelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            int num = sc.nextInt();
            arr1[i] = num;
        }
        for (int i = 1; i < arr1.length; i += 2) {
            System.out.print(arr1[i] + " ");
        }
    }
}
