package Leetcode;

public class remove_outermost_parentheses {
    public String removeOuterParentheses(String s) {
        // (()())(())
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (counter != 0) {
                    sb.append(c);// (
                }

                counter++; //1
            } else {
                counter--;//0
                if (counter != 0) {
                    sb.append(c);
                }

            }
        }

        return sb.toString();
    }
}
