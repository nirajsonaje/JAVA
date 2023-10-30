package no_problems;

import java.util.Scanner;

public class swapxy {
    public static void main(String[] args) {

        // First assign value of x to c and print the string with the help of
        // System.out.println("c = " + c),

        // Then, assign value of y to x and print the string with the help of
        // System.out.println("x = " + x),

        // Then, assign value of c to y and print the string with the help of
        // System.out.println("y = " + y).

        // In the next line print the string with the help of System.out.println("x = "
        // + x),

        // In the next line print the string with the help of System.out.println("y = "
        // + y).
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int c;

        System.out.println("c = " + x);
        System.out.println("x = " + y);
        c = x;
        System.out.println("y = " + c);

        x = y;
        y = c;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
