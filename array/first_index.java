package array;

import java.util.Scanner;

public class first_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }
        int key = sc.nextInt();
        int firstIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                firstIndex = i;
                break;
            }
        }
        System.out.println(firstIndex);
    }
}
