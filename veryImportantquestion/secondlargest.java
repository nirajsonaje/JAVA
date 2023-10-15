package veryImportantquestion;

import java.util.Scanner;

public class secondlargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();

        int B = scanner.nextInt();

        int C = scanner.nextInt();

        int secondLargest;
        if (A >= B && A >= C) {
            if (B >= C) {
                secondLargest = B;
            } else {
                secondLargest = C;
            }
        } else if (B >= A && B >= C) {
            if (A >= C) {
                secondLargest = A;
            } else {
                secondLargest = C;
            }
        } else {
            if (A >= B) {
                secondLargest = A;
            } else {
                secondLargest = B;
            }
        }

        // Output
        System.out.println(secondLargest);
    }
}
