import java.util.Scanner;
// You will be given an input n of integer data-type. 
// You have to print numbers of the series 2, 9, 16, 23.... till n in different lines,
//  where the last number printed should be an integer just less than n or equal to n.

// To be clear, you will print n if it belongs to the series.
public class problem78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 2; i <= n; i += 7) {
            System.out.println(i);
        }
    }
}
