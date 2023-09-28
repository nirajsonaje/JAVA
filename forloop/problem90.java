
import java.util.Scanner;

//Write a program to print numbers from n to 5 .Where n is taken as input from user.
public class problem90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 5; i--) {
            System.out.print(i + " ");
        }

    }
}
