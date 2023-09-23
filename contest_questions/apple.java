package contest_questions;

import java.util.Scanner;

public class apple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int batteryHealth = scanner.nextInt();

        if (batteryHealth >= 80) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
