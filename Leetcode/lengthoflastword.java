package Leetcode;

// https://leetcode.com/problems/length-of-last-word/description/
public class lengthoflastword {
    public static int lengthOfLastWord(String s) {
        String[] words = s.split("\\s+");
        String lastWord = words[words.length - 1];
        int length = lastWord.length();
        return length;
    }

    public static void main(String[] args) {
        String x = "niraj sonaje";
        int y = lengthOfLastWord(x);
        System.out.println(y);
    }
}
