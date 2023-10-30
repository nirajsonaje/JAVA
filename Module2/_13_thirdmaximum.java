import java.util.Scanner;

public class _13_thirdmaximum {
    public static int thirdMax(int[] nums) {
        // Initialize three long variables to represent the top three maximum values.
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        // Iterate through the elements in the 'nums' array.
        for (int num : nums) {
            if (num > first) {
                // If the current number is greater than the first maximum:
                // Update the values of 'first', 'second', and 'third'.
                third = second;
                second = first;
                first = num;
            } else if (num < first && num > second) {
                // If the current number is between the first and second maximum:
                // Update the values of 'second' and 'third'.
                third = second;
                second = num;
            } else if (num < second && num > third) {
                // If the current number is between the second and third maximum:
                // Update the value of 'third'.
                third = num;
            }
        }

        // Check if the third maximum exists or not.
        return third == Long.MIN_VALUE ? (int) first : (int) third;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int no = thirdMax(arr);
        System.out.println(no);
    }
}
