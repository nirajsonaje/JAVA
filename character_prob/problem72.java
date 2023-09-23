package character_prob;
// Take in a character as an input from the user,

// A. Conditon 1: If the character is an alphabet then you need to toggle the character first,

// For eg, if the entered character is a, then convert it into A, and if the entered character 
// is A then convert it into a, this simply means that if the entered character 
// is a capital case then convert it into small case character and vice-versa.

// After toggling the character, a. if the resultant character is not ‘a’, ‘A’, ‘b’, ‘B’, 
// then take two jumps to the left and print the character, for eg. If the toggled character 
// is c then print a, If the toggled character is Z, then print X.

// b. If the toggled character is ‘a’, ‘A’, ‘b’, ‘B’, then print Sorry

// B. Condition 2: Otherwise print No alphabet
import java.io.*;
import java.util.*;

public class problem72 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char inputChar = scanner.next().charAt(0);

    char toggledChar;

    if (Character.isUpperCase(inputChar)) {
      toggledChar = Character.toLowerCase(inputChar);
    } else if (Character.isLowerCase(inputChar)) {
      toggledChar = Character.toUpperCase(inputChar);
    } else {

      System.out.println("No alphabet");
      return;
    }

    if (toggledChar != 'a' && toggledChar != 'A' && toggledChar != 'b' && toggledChar != 'B') {

      char resultChar = (char)(toggledChar - 2);
      System.out.println(resultChar);
    } else {

      System.out.println("Sorry");
    }
  }
}