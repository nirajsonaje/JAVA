import java.util.Scanner;

public class problem129 {
    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);
        int test=sc.nextInt();
        for(int j=1;j<=test;j++){
int n=sc.nextInt();
        int steps=0;
        while(n>0){
            if(n%2==0){
                n-=1;
                steps++;

            }
            else{
                n-=3;
                steps++;
            }
            
        }
         System.out.println(steps);
        }
        
    }
   
}
