package If_else;

// There are three friends A , B , C. You will be given the ages of these 
//three friends as an integer input, 
// you have to print the same of the oldest friend among them.

// Input Format

// For each test case, you will be given

// Age of A in the first line as an integer input

// Age of B in the second line as an integer input

// Age of C in the third line as an integer input

// Output Format

// You have print A or B or C accordingly.

import java.util.Scanner;

public class problem40 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("A");
        }
        else if(b>c){
            System.out.println("B");
        }
        else {
            System.out.println("C");
        }
}
}
