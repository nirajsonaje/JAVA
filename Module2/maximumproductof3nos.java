import java.util.Scanner;

public class maximumproductof3nos {
    public static int maximumProduct(int[] nums) {
        // Initialize the three maximum numbers and two minimum numbers.
        // -2147483648
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        // 2147483648
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        // Iterate through the elements in the array.
        for (int num : nums) {
            if (num > max1) {
                // If the current number is greater than max1, update max1, max2, and max3.
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                // If the current number is greater than max2 but less than max1, update max2
                // and max3.
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                // If the current number is greater than max3 but less than max2, update max3.
                max3 = num;
            }

            if (num < min1) {
                // If the current number is smaller than min1, update min1 and min2.
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                // If the current number is smaller than min2 but greater than min1, update
                // min2.
                min2 = num;
            }
        }

        // Calculate the maximum product considering both positive and negative values.
        int product1 = max1 * max2 * max3; // Product of three maximum values.
        int product2 = max1 * min1 * min2; // Product of the maximum value and two minimum values.

        // Return the maximum of product1 and product2 as the final result.
        return Math.max(product1, product2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int no = maximumProduct(arr);
        System.out.println(no);
    }
}
