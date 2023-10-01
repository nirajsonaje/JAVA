package no_problems;

public class armstrong1 {
    public static boolean isArmstrong(int n) {
        int originalNumber = n;
        int sum = 0;

        int numberOfDigits = (int) Math.log10(n) + 1;

        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, numberOfDigits);
            n /= 10;
        }

        return sum == originalNumber;
    }
    public static void main(String[] args) {
        
    }
}
