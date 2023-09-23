// Take the age and salary of a person as an integer input,

// If the age is above 40 then

// a. If the salary is greater than or equal to 30,000 then print You are rich and adult

// b. Else print You are an adult

// Else if age is less than or equal to 40

// a. If the salary is greater than or equal to 12,000, then print You are rich and young

// b. Else print You are young

// Input Format

// For each test case,

// You will get the age of the person in the first line as an integer input,

// You will get the salary of the person in the second line as an integer input.

import java.util.Scanner;

public interface problem41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x > 40) {
            if (y >= 30000) {
                System.out.println("You are rich and adult");
            } else {
                System.out.println("You are an adult");
            }
        } else if (x <= 40) {
            if (y >= 12000) {
                System.out.println("You are rich and young");
            } else {
                System.out.println("You are young");
            }
        }
    }
}
