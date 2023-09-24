package contest_questions;

import java.util.Scanner;

public class TOP_mgmnt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int experience = scanner.nextInt();
        int salary = scanner.nextInt();
        int rank = scanner.nextInt();

        if (experience >= 10 || salary >= 50000 || rank >= 10) {
            System.out.println("You are in top management");
        } else {
            System.out.println("You are not in top management");
        }
    }
}
