package array;

import java.util.Scanner;

public class xispresent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // Number of elements in the array
        int[] arr = new int[n]; // Create an array of size n
        
        // Input elements of the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int target = sc.nextInt(); // Element to search
        
        // Initialize a flag to check if the element is found
        boolean found = false;
        
        // Iterate through the array to search for the target element
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                found = true;
                break; // Element found, no need to continue searching
            }
        }
        
        // Print the result
        System.out.println(found);
        

    }
}
