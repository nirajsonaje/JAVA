import java.util.Scanner;
//You will be given an input n as an integer data-type. 
//You have to print the series from n to 1 in n different lines.
public class problem70 {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=n;i>=1;i--){
            System.out.println(i);
        }
    }
}
