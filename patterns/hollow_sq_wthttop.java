package patterns;

import java.util.Scanner;

public class hollow_sq_wthttop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
              
                if ( i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }
}
