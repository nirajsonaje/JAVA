package HackerRank;
// A string containing only parentheses is balanced if the following is true: 1. 

import java.util.Scanner;
import java.util.Stack;

// if it is an empty string 2. if A and B are correct, AB is correct, 
// 3. if A is correct, (A) and {A} and [A] are also correct.

// Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"

// Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.

// Given a string, determine if it is balanced or not.

// Input Format

// There will be multiple lines in the input file, each having a single non-empty string. 
//You should read input till end-of-file.

// The part of the code that handles input operation is already provided in the editor.

// Output Format

// For each case, print 'true' if the string is balanced, 'false' otherwise.

// Sample Input

// {}()
// ({()})
// {}(
// []
// Sample Output

// true
// true
// false
// true
public class balancedornot {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            // Complete the code
            boolean isBalanced = isBalanced(input);
            System.out.println(isBalanced);
        }

    }

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
