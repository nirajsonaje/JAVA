package character_prob;

public class AAAbb {
    public static void main(String[] args) {
        char upperChar = 'A';
        char lowerChar = 'b';

        for (int i = 1; i <= 13; i++) {
            System.out.println(upperChar + "" + upperChar + "" + upperChar);
            System.out.println(lowerChar + "" + lowerChar);
            upperChar += 2;
            lowerChar += 2;
        }
    }
}
