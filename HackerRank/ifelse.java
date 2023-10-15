package HackerRank;

import java.util.Scanner;

public class ifelse {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        String ans = "";
        if (N % 2 == 1) {
            ans = "Weird";
        } else {
            if (N >= 2 && N <= 5) {
                ans = "Not Weird";
            } else if (N >= 6 && N <= 20) {
                ans = "Weird";
            } else {
                ans = "Not Weird";
            }

            // Complete the code

        }
        System.out.println(ans);

    }
}
