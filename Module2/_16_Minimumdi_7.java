import java.util.Arrays;
import java.util.Scanner;

public class _16_Minimumdi_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of the array
        int N = sc.nextInt();

        // Input the elements of the array
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        // Input the value of k
        int k = sc.nextInt();

        // Find the minimum possible difference
        int result = findMinDifference(nums, k);
        System.out.println(result);
    }

    static int findMinDifference(int[] nums, int k) {
        // Sort the array in non-decreasing order
        Arrays.sort(nums);

        int minDifference = Integer.MAX_VALUE;

        // Iterate through the array and find the minimum difference
        for (int i = 0; i <= nums.length - k; i++) {
            int difference = nums[i + k - 1] - nums[i];
            minDifference = Math.min(minDifference, difference);
        }

        return minDifference;
    }
}
