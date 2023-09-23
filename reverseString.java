import java.util.Scanner;

//reverse string
public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Original = sc.next();
        String Reverse = "";
        for (int i = 0; i < Original.length(); i++) {
            Reverse = Original.charAt(i) + Reverse;
        }
        System.out.println(Reverse);
    }
}
