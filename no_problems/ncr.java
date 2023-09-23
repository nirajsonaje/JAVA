package no_problems;

import java.util.Scanner;
//nCr = (n!) / (r! * (n-r)!)
public class ncr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int numerator=1;
        int d1=1;
        int d2=1;
        for(int i=1;i<=n;i++){
            numerator*=i;
        }
         for(int j=1;j<=r;j++){
            d1*=j;
        }
        for(int k=1;k<=n-r;k++){
            d1*=k;
        }
        System.out.println(numerator/d1*d2);
    }
}
