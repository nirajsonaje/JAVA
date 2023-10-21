package Leetcode;

public class test {
    // public char nextGreatestLetter(char[] letters, char target) {
    //     int minimum = Integer.MAX_VALUE;
    //     for (int i = 0; i < letters.length; i++) {
    //         int value = letters[i] - 'a';
    //         if (value > 0 && value < minimum) {
    //             minimum = value;
    //         }
    //     }
    //     int count = 0;
    //     for (char c = 'a'; c <= 'z' && count < 3; c++) {
    //         if (count == minimum) {
    //             return c;
    //         }
    //         count++;
    //     }
    //     return letters[0];
    // }
    public static void main(String[] args) {
             int minimum = Integer.MAX_VALUE;
             char [] letters={'c','f','j'};
        for (int i = 0; i < letters.length; i++) {
            int value = letters[i] - 'a';
            if (value > 0 && value < minimum) {
                minimum = value;
            }
        }
        int count = 0;
        for (char c = 'a'; c <= 'z' && count < 3; c++) {
            if (count == minimum) {
                return c;
            }
            count++;
        }
    }
}
