package no_problems;

import java.util.Scanner;

public class even_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int j = x; j <= y; j++) {
                if(j%2==0){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
