package forloop;
import java.util.Scanner;

public class problem86 {

    // Alice, a programmer, was given a task to write a program that prints the first N multiples 
    // of 9 in a single line. She tackled the problem by using a loop to iterate over the numbers . 
    // Finally, Alice printed all N multiples of 9 in a single line.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(9*i+" ");
        }
    }
}
