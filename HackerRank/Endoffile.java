package HackerRank;

import java.util.Scanner;

public class Endoffile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineNum = 1;

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            System.out.println(lineNum + " " + line);
            lineNum++;
        }
    }
}
