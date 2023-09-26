package no_problems;

import java.util.Scanner;
//nCr = (n!) / (r! * (n-r)!)

public class ncr {


public static int factorial(int a ){
    int result=1;
    for(int i=1;i<=a;i++){
        result*=i;
    }
    return result;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
       int num=factorial(n);
       int result=factorial(n-r);
       int re=factorial(r);
      
        System.out.println(num/(result*re));
    }
}
