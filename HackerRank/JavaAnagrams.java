package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {
    static boolean isAnagram(String A, String B) {
        // Complete the function
        if (A.length() != B.length()) {
            return false;
        } else {
            // sort the strings and see if they are equal to be considered an Anagram
            char a[] = A.toLowerCase().toCharArray();
            char b[] = B.toLowerCase().toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            String sortedA = String.valueOf(a);
            String sortedB = String.valueOf(b);
            if (sortedA.equals(sortedB)) {
                return true;
            }

        }
        return false;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        boolean ret = isAnagram(A, B);
        if (ret)
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");

    }
}
