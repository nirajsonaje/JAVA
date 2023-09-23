package contest_questions;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int costOfRide = scanner.nextInt();

        String category;

        if (costOfRide < 200) {
            category = "regular ride";
        } else if (costOfRide >= 200 && costOfRide < 500) {
            category = "average ride";
        } else {
            category = "premium ride";
        }

        System.out.println(category);
    }
}
