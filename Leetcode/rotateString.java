package Leetcode;

//https://leetcode.com/problems/rotate-string/description/
public class rotateString {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        return ((s + s).indexOf(goal) >= 0);
    }
}
