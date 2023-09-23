// Take in a ch as a character input from the user, 
// and print You are a male if M or m is taken as input. 
// And print You are a female if F or f is taken as input. 
// And if some other character is taken as an input, then print Type again.

// Input Format

// For each test case, You will be given a ch as a character input.

import java.io.*;
import java.util.*;

public class problem62 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char ch = scanner.next().charAt(0);

        if (ch == 'M' || ch == 'm') {
            System.out.println("You are a male");
        }

        else if (ch == 'F' || ch == 'f') {
            System.out.println("You are a female");
        }

        else {
            System.out.println("Type again");
        }

    }
}