package verysimple;
import java.util.Scanner;
// You will be given an input n and x as an integer input, and you have to print the numbers 
//from n to x in different lines.
// Input Format
// For each test case, you will get
// n as an integer input in the first line,
// x as an integer input in the second line.
class problem82{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        
       
         if (n <= x) {
            for (int i = n; i <= x; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = n; i >= x; i--) {
                System.out.println(i);
            }
        }
    }
}