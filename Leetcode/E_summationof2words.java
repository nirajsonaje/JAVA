package Leetcode;
//https://leetcode.com/problems/check-if-word-equals-summation-of-two-words/description/

// Example 1:

// Input: firstWord = "acb", secondWord = "cba", targetWord = "cdb"
// Output: true
// Explanation:
// The numerical value of firstWord is "acb" -> "021" -> 21.
// The numerical value of secondWord is "cba" -> "210" -> 210.
// The numerical value of targetWord is "cdb" -> "231" -> 231.
// We return true because 21 + 210 == 231.
public class E_summationof2words {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return getNumericValue(firstWord) + getNumericValue(secondWord) == getNumericValue(targetWord);
    }

    public int getNumericValue(String str) {
        int sum = 0;
        for (char c : str.toCharArray())
            sum = sum * 10 + (c - 'a');// if c='a' then a-a=0
        return sum;
    }
}
