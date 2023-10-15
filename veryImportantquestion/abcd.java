package veryImportantquestion;

public class abcd {
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
