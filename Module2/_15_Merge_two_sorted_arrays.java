import java.util.Scanner;

public class _15_Merge_two_sorted_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size and elements of the first array A[]
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // Input size and elements of the second array B[]
        int M = sc.nextInt();
        int[] B = new int[M];
        for (int i = 0; i < M; i++) {
            B[i] = sc.nextInt();
        }

        // Merge the two sorted arrays
        int[] mergedArray = mergeSortedArrays(A, B);

        // Print the merged array
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
    }

    static int[] mergeSortedArrays(int[] A, int[] B) {
        int N = A.length;
        int M = B.length;
        int[] mergedArray = new int[N + M];

        int i = 0; // Index for array A
        int j = 0; // Index for array B
        int k = 0; // Index for the merged array

        // Merge the arrays in non-decreasing order
        // 4
        // 1 3 5 7
        // 4
        // 2 4 6 8
        while (i < N && j < M) {
            if (A[i] <= B[j]) {
                mergedArray[k] = A[i];
                i++;
                k++;
            } else {
                mergedArray[k] = B[j];
                j++;
                k++;
            }

        }

        // Copy any remaining elements from A (if any)
        while (i < N) {
            mergedArray[k] = A[i];
            i++;
            k++;
        }

        // Copy any remaining elements from B (if any)
        while (j < M) {
            mergedArray[k] = B[j];
            j++;
            k++;
        }

        return mergedArray;
    }
}
