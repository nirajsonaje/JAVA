import java.util.Scanner;

public class problem88 {
    // As a programming enthusiast, Mark enjoyed creating programs that could 
    // perform complex calculations and generate interesting patterns. One day, 
    // he came across a series of numbers - 3, 11, 19, 27, 35... that intrigued him.
    //  He decided to write a program that could print this series up 
    // to a given value of n, using i = i + 8.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=3;i<=n;i+=8){
            System.out.print(i+" ");
        }
    }
}
