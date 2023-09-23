import java.util.Scanner;

public class problem84 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
        // Read n from the user
        int n = scanner.nextInt();
        
        // Close the scanner
        scanner.close();
        
        // Print odd numbers from n to 1
        for (int i = n; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.println(i);
            } 
        }
    }
}
