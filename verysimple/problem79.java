import java.util.Scanner;
// You will be given an integer input n, and you have to print the series 3, 7, 11, 15till the integer 
// just less than n, in n different lines.

// Input Format

// For each test case, you will be given an integer input n.
public class problem79 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
       
        for (int i = 3; i < n; i += 4) {
            System.out.println(i);
        }
    }
}
