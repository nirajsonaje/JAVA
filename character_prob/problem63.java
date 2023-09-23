package character_prob;
// Take in a character as an input and then

// a. Print Small case if it is a small case character.

// b. Print Capital case if it is a capital case character.

// c. Print Digit if it is a digit.

// d. Print None is none of the above conditions follow.

import java.util.Scanner;

public class problem63 {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        char input = scc.next().charAt(0);
        if (Character.isLowerCase(input)) {
            System.out.println("Small case");
        } else if (Character.isUpperCase(input)) {
            System.out.println("Capital case");
        } else if (Character.isDigit(input)) {
            System.out.println("Digit");
        } else {
            System.out.println("None");
        }

    }
}
