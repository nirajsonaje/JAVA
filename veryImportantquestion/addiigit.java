package veryImportantquestion;

import java.util.Scanner;

public class addiigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char input = scanner.next().charAt(0);
        if (Character.isDigit(input)) {
            int val = Character.getNumericValue(input) + 100;
            System.out.println(val);
        } else {
            System.out.println("This is not a digit");
        }
    }
}
