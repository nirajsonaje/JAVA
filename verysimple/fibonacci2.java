import java.util.Scanner;

public class fibonacci2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ptr1=0;
        int ptr2=1;
        int ptr3=1;
        int ptr4=2;
        for(int i=1;i<=n;i++){
            
            ptr4=ptr1+ptr2+ptr3;
            ptr1=ptr2;
            ptr2=ptr3;
            ptr3=ptr4;
           
        }
        System.out.println(ptr4);

    }
}
