package Leetcode;

public class reverseWordsinstring {
    public static String reverseWords(String s) {
        String words[] = s.split("\\s");
        String reverse = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reverse += words[i] + " ";
        }
        return reverse;
    }

    public static void main(String[] args) {
        String x = reverseWords("niraj sonaje ");
        System.out.println(x);

    }
}
