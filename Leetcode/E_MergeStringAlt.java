package Leetcode;

//https://leetcode.com/problems/merge-strings-alternately/
public class E_MergeStringAlt {
    public static String mergeAlternately(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        // 2 4
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < m || i < n; ++i) {

            // ab
            // pqrs
            if (i < m) {
                ans.append(word1.charAt(i));
            }
            if (i < n) {
                ans.append(word2.charAt(i));
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String x = mergeAlternately("niraj", "sonaje");
        System.out.println(x);
    }
}
