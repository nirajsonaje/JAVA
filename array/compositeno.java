package array;

import java.util.Scanner;

public class compositeno {
    // Function to check if a number is composite
    static boolean isComposite(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not composite numbers
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return true; // Number is divisible by some other number, so it's composite
            }
        }
        return false; // Number is not divisible by any number other than 1 and itself, so it's not
                      // composite
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print composite numbers in the array
        for (int i = 0; i < n; i++) {
            if (isComposite(arr[i])) {
                System.out.println(arr[i]);
            }
        }
    }

}
