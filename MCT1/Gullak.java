package MCT1;

import java.util.Scanner;

public class Gullak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        int day = 1;
        int money = 1;

        while (day <= n) {// 15
            total += money;// 1 3 7
            money += 1;// 2 3 4 
            day += 1;// 2 3 4

            if (day % 7 == 1) { // Monday
                money = day / 7 + 1;
            }
        }
        System.out.println(total);
    }
}
