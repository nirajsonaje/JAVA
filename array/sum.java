package array;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Read the size of the array
        int[] arr = new int[n]; // Declare an array of size n

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0; // Initialize sum to zero

        // Calculate the sum of array elements using a loop
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        System.out.println(sum); // Print the sum
    }
}
