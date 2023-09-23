package verysimple;
import java.util.Scanner;

public class problem87 {
    // Once upon a time, there was a young programmer named Ben who was passionate
    // about coding.
    // One day, his mentor challenged him to write a program that would print the
    // first N multiples of 11.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(11 * i + " ");
        }
    }
}
