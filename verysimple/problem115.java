import java.util.Scanner;
// Nth term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -

// F(n) = F(n-1) + F(n-2), 
// Where, F(1) = F(2) = 1
// Provided N you have to find out the Nth Fibonacci Number.
public class problem115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f1=0;
        int f2=1;
            int f3=1;
        for(int i=1;i<=n;i++){
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }
        System.out.println(f1);
    }
}
