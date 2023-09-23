import java.util.Scanner;

public class problem104 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        for(int i=0;i<str.length();i+=2){
            if(i%2==0){
                System.out.print(str.charAt(i));
            }
           
        }
    }
}
