package veryImportantquestion;

import java.util.Scanner;

public class printchar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (input.length() >= 4) {

            char characterAtIndex3 = input.charAt(3);
            System.out.println(characterAtIndex3);
        } else {
            System.out.println("Small string");
        }

    }
}
