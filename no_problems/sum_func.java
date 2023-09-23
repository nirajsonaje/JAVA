package no_problems;

import java.util.Scanner;

public class sum_func {

    public static void findSum(int x, int y){
            int sum=x+y;
        System.out.print(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            findSum( x,  y);
            System.out.println();
        }
    }
}
