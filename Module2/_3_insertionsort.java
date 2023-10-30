import java.util.Scanner;

public class _3_insertionsort {
    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;

    }

    public static void insertionsort(int arr[], int n) {
        for (int i = 1; i <= n - 1; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[j + 1])
                    swap(arr, j, j + 1);
                else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        insertionsort(arr, n);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
