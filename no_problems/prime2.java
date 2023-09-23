package no_problems;

import java.util.Scanner;

public class prime2 {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        int x = scanner.nextInt();
      
        int y = scanner.nextInt();

        if (x <= 1) {
            x = 2;
        }

       
        for (int number = x; number <= y; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }
}
