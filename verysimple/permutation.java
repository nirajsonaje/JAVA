package verysimple;
import java.util.Scanner;


public class permutation {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int k = sc.nextInt();

         int numerator=1;
         for(int i=1;i<=n;i++){
            numerator*=i;
         }

         int denominator=1;
         for(int i=1;i<=n-k;i++){
            denominator*=i;
         }
         System.out.println(numerator/denominator);

    }
}
