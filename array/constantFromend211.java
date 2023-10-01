package array;

import java.util.Scanner;

public class constantFromend211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = new char[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            char ch = arr[i];
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                System.out.println(i);
                break;
            }
        }

    }
}
