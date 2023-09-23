package verysimple;
// Take length and breadth of the rectangle as input. 
// And print area of the rectangle in the first line and perimeter of the rectangle in the second line.

// Input Format

// In the first line, length of the rectangle is given as input.
//  In the second line, breadth of the rectangle is given as input.

import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(x * y);
        System.out.println(2 * (x + y));

    }

}
