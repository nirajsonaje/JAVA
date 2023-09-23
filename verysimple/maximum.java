package verysimple;
import java.util.Scanner;

public class maximum {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int maximum;
        for(int i=1;i<=n;i++){
             maximum=sc.nextInt();
                if(maximum>maximum){
                    System.out.println(maximum);
                }
        }
        
    
        
    }
}
