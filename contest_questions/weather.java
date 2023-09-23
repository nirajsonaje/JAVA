package contest_questions;

import java.util.Scanner;

public class weather {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the weather data for 7 days
        int sunnyDays = 0;
        int rainyDays = 0;

        for (int i = 0; i < 7; i++) {
            int dayWeather = scanner.nextInt();
            if (dayWeather == 1) {
                sunnyDays++;
            } else {
                rainyDays++;
            }
        }

        // Determine if the weather report is good
        if (sunnyDays > rainyDays) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
