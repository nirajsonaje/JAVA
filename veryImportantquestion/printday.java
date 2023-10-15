package veryImportantquestion;

import java.util.Scanner;

public class printday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayNumber = scanner.nextInt();

        String dayName = "";

        switch (dayNumber) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;

        }

        System.out.println(dayName);

    }
}
