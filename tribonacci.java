import java.util.Scanner;

public class tribonacci {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
            int nums[]={2,3,5,6};
            int target=5;
           int result[]= twoSum(nums,target);
           for(int val :result){
            System.out.println(val);
           }
    }
}
