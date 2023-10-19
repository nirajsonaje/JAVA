package array;

import java.util.Scanner;

public class elementinminority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int mincount = Integer.MAX_VALUE;// micount
        int element_having_min_freq = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count <= mincount) {
                mincount = count;
                element_having_min_freq = arr[i];
            }
        }
        System.out.println(element_having_min_freq);
    }
}
