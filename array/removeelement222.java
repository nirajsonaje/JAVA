package array;

import java.util.Scanner;

public class removeelement222 {
   public static int removeElement(int[] nums, int val) {
        int k = 0; 
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Move non-val elements to the front
                k++;
            }
        }
        
        return k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int val = sc.nextInt();

        int result = removeElement(nums, val);

        System.out.println(result);

        
    }

}
