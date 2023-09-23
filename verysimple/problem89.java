import java.util.Scanner;

//As a software developer, Jane was always looking for new challenges to 
//improve her programming skills. One day, she came across a series of numbers that she found interesting: 
//13, 18, 23, 28, 33... She decided to
// write a program that could print this series up to a given value of n, using i = i + 5.
public class problem89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 13; i <= n; i += 5) {
            System.out.print(i + " ");
        }

    }
}
