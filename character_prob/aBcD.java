package character_prob;

public class aBcD {
    // Print a, B, c, D, e, F, g...... 26 characters where each character should be
    // printed in
    // a separate line.
    public static void main(String[] args) {
        char lowerChar = 'a';
        char upperChar = 'B';

        while (lowerChar <= 'z' && upperChar <= 'Z') {
            System.out.println(lowerChar);
            System.out.println(upperChar);
            lowerChar += 2;
            upperChar += 2;
        }
    }
}
