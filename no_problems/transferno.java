package no_problems;

import java.util.Scanner;

public class transferno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        String reversedNum = "";
        for (int i = 1; i <=2; i++) {
            int digit = n % 10;
            reversedNum = digit+reversedNum;
            n /= 10;
        }
        System.out.println(reversedNum+""+n);
    }
}
