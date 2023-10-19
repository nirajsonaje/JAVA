package character_prob;

public class ZyXw {

    public static void main(String[] args) {
        char ch = 'Z';
        char ch1 = 'y';
        while (ch >= 'A' && ch1 >= 'a') {
            System.out.println(ch);
            System.out.println(ch1);

            ch -= 2;
            ch1 -= 2;
        }
    }

}
