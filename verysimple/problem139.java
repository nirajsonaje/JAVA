import java.util.Scanner;

public class problem139 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int no=sc.nextInt();
            if(no%2==0 && no%3==0){
                System.out.println("Even Divisible by 3");
            }
            else if(no%2!=0 && no%3==0){
                System.out.println("Odd Divisible by 3");
            }
            else if(no%2==0 && no%3!=0){
                System.out.println("Even Not Divisible by 3");
            }
            else if(no%2!=0 && no%3!=0){
                System.out.println("Odd Not Divisible by 3");
            }
        }
    }
}
