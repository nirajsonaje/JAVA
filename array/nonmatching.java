package array;

import java.util.Scanner;

public class nonmatching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            int num = sc.nextInt();
            arr1[i] = num;
        }
        int arr2[] = new int[n];
        for (int i = 0; i < arr2.length; i++) {
            int num = sc.nextInt();
            arr2[i] = num;
        }
        for (int i = 0; i < n; i++) {
            if(arr1[i]!=arr2[i]){
                System.out.println(i);
                break;
            }
        }
    }
}
