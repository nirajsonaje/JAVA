package no_problems;

import java.util.Scanner;

public class armstrong {

    public static boolean isArmstrong(int n) {
        int originalNumber = n;
        int sum = 0;

        while (n >= 1) {
            int digit = n % 10;
            sum += Math.pow(digit, 3);
            n /= 10;
        }

        return sum == originalNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        for (int number = x; number <= y; number++) {
            if(number>=1&& number <=9){
                 System.out.println(number);
            }
            else  if (isArmstrong(number)) {
                
                System.out.println(number);
            }
        }

        
    }
}
