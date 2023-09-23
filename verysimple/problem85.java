import java.util.Scanner;
// Once upon a time, there was a young programmer named John who was working on a project.
//  He needed to create a program that would print numbers from 20 up to a user-specified limit. 
//  John knew that he needed to use a loop to iterate over the numbers and print them out one by one.

// He started by writing the code to take input from the user for the upper limit of the range of numbers. 
// Once he had that value stored in a variable, he used a for loop to iterate over the range 
// of numbers from 20 to N.

// As the program ran, it printed out each number in the range, starting with 20 and ending with the
//  user-specified value. John tested the program several times and was satisfied with how it worked.
public class problem85 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=20;i<=n;i++){
            System.out.print(i+" ");
        }
        
    }
}
