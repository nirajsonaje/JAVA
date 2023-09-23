import java.util.Scanner;

public class tribonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: n as an integer
        int n = scanner.nextInt();

        // Calculate the nth Tribonacci number using a loop
        int[] tribonacci = new int[n * 3];
        tribonacci[0] = 0;
        tribonacci[1] = 1;
        tribonacci[2] = 1;

        for (int i = 3; i <= n; i++) {
            tribonacci[i] = tribonacci[i - 1] + tribonacci[i - 2] + tribonacci[i - 3];
        }

        // Output: Print the nth Tribonacci number
        System.out.println(tribonacci[n]);
    }
}
