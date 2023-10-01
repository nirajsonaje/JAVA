package array;

import java.util.Scanner;

public class productexceptindex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < nums.length; i++) {
            int num = sc.nextInt();
            nums[i] = num;
        }
        for (int i = 0; i < nums.length; i++) {
            int product = 1;

            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    product *= nums[j];
                }

            }
            System.out.println(product);
        }

    }
}
