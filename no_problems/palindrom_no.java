package no_problems;

import java.util.Scanner;

public class palindrom_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            

       
        int num = sc.nextInt();

        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        if (originalNum == reversedNum) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        }
    }
}
