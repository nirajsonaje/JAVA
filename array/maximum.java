package array;

import java.util.Scanner;

public class maximum {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < nums.length; i++) {
            int num = sc.nextInt();
            nums[i] = num;
        }
        int max=nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>max){
                max=nums[i];
            }
        }
        System.out.println(max);
    }
}
