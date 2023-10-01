package array;

import java.util.Scanner;

//approach
//sorting array and then print second largest
public class secondlargest218 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize variables to keep track of the largest and second largest elements
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Iterate through the array to find the largest and second largest elements
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        // Check if there is a valid second largest element
        if (secondLargest == Integer.MIN_VALUE || largest == secondLargest) {
            System.out.println(-2147483648);
        } else {
            System.out.println(secondLargest);
        }

    }
}
