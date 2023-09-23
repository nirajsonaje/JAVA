import java.util.Scanner;

public class problem120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int k = sc.nextInt();
          int l= sc.nextInt();
          for(int i=n;i>=l;i-=k){
           
            System.out.println(i);
           
       }
    }
    
}
