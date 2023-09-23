// As a junior programmer, Jenny was given the task to develop a program
//  that could take two character inputs, x and y, and form a two-digit number.
//   The program had to follow certain conditions while forming the number.
//    If the first character x was zero, then only the second character y should be printed in the integer 
//    data-type format. However, if x was any other digit, the program should print the number xy.

// Jenny was excited to work on the project, and she knew that it 
// would help her learn more about programming. She spent several hours coding 
// and testing the program, ensuring that it would give the correct output for any values of x and y. 
// After testing the program with various inputs, including x = '3' and y = '8', 
// she was pleased to see that the program correctly outputted the number 38 in the integer data-type format.

// Input Format

// For each test case,

// You will get the digit character x as a character data-type in the first line,

// You will get the digit character y as a character data-type in the second line.
import java.io.*;
import java.util.*;

public class problem71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char input = scanner.next().charAt(0);
        char input2 = scanner.next().charAt(0);
        if (input == '0') {
            System.out.println(input2);
        } else {

            int val = Integer.parseInt("" + input + input2);
            System.out.println(val);
        }
    }
}