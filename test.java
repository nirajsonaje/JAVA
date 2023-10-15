import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int original = 123;
        int reverse = 0;
        while (original > 0) {
            int digit = original % 10;//3//2//1

            reverse = reverse * 10 + digit;//3//32//321
            original /= 10;//12//2
        }
        System.out.println(reverse);
    }
}
