// You will be given two integers N and K as an integer input.

// You have to print the series N, N-K, N-2K where each number 
//should be printed in a separate line and you have to print till the 
//time the printed integer is greater than or equal to zero.


import java.util.Scanner;

public class problem93 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read N and K from the user
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        
       
        
        // Print the series until the printed integer is greater than or equal to zero
        while (N >= 0) {
            System.out.println(N);
            N -= K;
        }
    }
}
