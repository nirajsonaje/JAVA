package Leetcode;

//https://leetcode.com/problems/longest-common-prefix/
import java.util.Arrays;

public class longestcommonprex {

    public static void main(String[] args) {
        String[] v = { "flower", "flow", "flight" };
        StringBuilder ans = new StringBuilder();
        Arrays.sort(v);
        System.out.println("sorted array");
        System.out.println(Arrays.asList(v));
        String first = v[0];
        String last = v[v.length - 1];
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                ans.toString();
            } else {
                ans.append(first.charAt(i));
            }

        }
        System.out.println(ans.toString());
    }
}
// Example 1:

// Input: strs = ["flower","flow","flight"]
// Output: "fl"