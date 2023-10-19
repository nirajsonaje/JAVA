package character_prob;
// Take a Character as Input and check whether the character is in Uppercase or Lowercase.

// Print "Char is Uppercase" if the given character is an Uppercase or Capital Alphabet, and 
//print "Char is Lowercase" if the character is an Lowercase or Small Alphabet.

// Note:- You can Assume that the given Character is an alphabet & Do not use built-in methods.

import java.util.Scanner;

public class uppercaselowercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char ch = scanner.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Char is Uppercase");
        } else {
            System.out.println("Char is Lowercase");
        }

    }
}
