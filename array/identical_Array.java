package array;

import java.util.Scanner;

public class identical_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the first array
        int n = scanner.nextInt();
        int[] array1 = new int[n];

        // Input elements for the first array
        for (int i = 0; i < n; i++) {
            array1[i] = scanner.nextInt();
        }

        // Input the size of the second array
        int m = scanner.nextInt();
        int[] array2 = new int[m];

        // Input elements for the second array
        for (int i = 0; i < m; i++) {
            array2[i] = scanner.nextInt();
        }

        // Check if the arrays are equal
        boolean isEqual = true;

        
            for (int i = 0; i < n; i++) {
                if (array1[i] != array2[i]) {
                    isEqual = false;
                    break;
                }
            }
        

        // Print true if arrays are equal, false otherwise
        System.out.println(isEqual);

    }
}
