package array;

import java.util.Scanner;

public class last_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }
        int key = sc.nextInt();
        int last_index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                last_index = i;
                break;
            }
        }
        System.out.println(last_index);
    }
}
