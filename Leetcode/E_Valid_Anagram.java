package Leetcode;

//https://leetcode.com/problems/valid-anagram/
public class E_Valid_Anagram {
    public boolean isAnagram(String s, String t) {
        // This line creates an integer array count of size 26.
        // This array will be used to count the frequency of each character from 'a' to
        // 'z'.
        int[] count = new int[26];
        // This loop iterates through each character in the s string. For each character
        // x, it increments the count of that character in the count array. For example,
        // if s is "hello," it will increment the counts for 'h', 'e', 'l', and 'o' in
        // the count array.
        // Count the frequency of characters in string s
        for (char x : s.toCharArray()) {
            count[x - 'a']++;
        }

        // Decrement the frequency of characters in string t
        for (char x : t.toCharArray()) {
            count[x - 'a']--;
        }

        // Check if any character has non-zero frequency
        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }

}
