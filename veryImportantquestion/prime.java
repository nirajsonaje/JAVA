package veryImportantquestion;
// The complexity of the above method

// Time complexity:  O(n) 

// Space complexity: O(1)
public class prime {
    public static String prime(int n) {
        if (n <= 1) {
            return "No";
        }
        for (int i = 2; i < n; i++) {
            if (n % 2 == 0) {
                return "No";
            }
        }
        return "Yes";

    }

    public static void main(String[] args) {
        int x = 20;
        System.out.println(prime(x));
    }
}
