package character_prob;
public class ZzYy {
    public static void main(String[] args) {
        char upperChar = 'Z';
        char lowerChar = 'z';

        while (upperChar >= 'A' && lowerChar >= 'a') {
            System.out.print(upperChar + " " + lowerChar + " ");
            upperChar -= 1;
            lowerChar -= 1;
        }
    }
}
