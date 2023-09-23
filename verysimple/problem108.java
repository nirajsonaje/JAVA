import java.util.Scanner;

public class problem108 {

    // "Write a program that takes an integer input from the user.
    // The program should keep dividing the integer by 3 and printing the resultant
    // value on each iteration until the value is greater than 0.

    // Can you write a solution for this problem?"

    // Note: Start printing from n, keep on updating n by dividing n by 3 each time,
    // and print the the updated value of n each time.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i > 0; i--) {
            if (i % 3 == 0) {
                System.out.print(i+" ");
            }
        }
    }
}
