package contest_questions;

import java.util.Scanner;

public class runnerup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three integers

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int secondLargest;

        if (A > B && A > C) {
            // A is the largest
            if (B > C) {
                // B is the second largest
                secondLargest = B;
            } else {
                // C is the second largest
                secondLargest = C;
            }
        } else if (B > A && B > C) {
            // B is the largest
            if (A > C) {
                // A is the second largest
                secondLargest = A;
            } else {
                // C is the second largest
                secondLargest = C;
            }
        } else {
            // C is the largest
            if (A > B) {
                // A is the second largest
                secondLargest = A;
            } else {
                // B is the second largest
                secondLargest = B;
            }
        }

        System.out.println(secondLargest);
    }
}
