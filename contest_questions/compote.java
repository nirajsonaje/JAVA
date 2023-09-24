package contest_questions;

import java.util.Scanner;

public class compote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(); // Number of lemons
        int b = scanner.nextInt(); // Number of apples
        int c = scanner.nextInt(); // Number of pears

        // Calculate the maximum number of compotes Nikolay can make
        int minRatio = Math.min(Math.min(a / 1, b / 2), c / 4);

        // Calculate the total number of fruits for the maximum compotes
        int totalFruits = minRatio * (1 + 2 + 4);

        System.out.println(totalFruits);
    }
}
