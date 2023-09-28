package array;

import java.util.Scanner;

public class nonmatchingend {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        // Input array1 elements
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input array2 elements
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

       // int nonMatchingIndex = -1; // Initialize to -1 (no non-matching element found yet)

        // Traverse the arrays from the end
        for (int i = n - 1; i >= 0; i--) {
            if (arr1[i] != arr2[i]) {
                System.out.println(i);
                break; // Exit the loop as soon as the first non-matching element is found
            }
        }

      
    }
}
