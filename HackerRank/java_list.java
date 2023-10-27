package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class java_list {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the initial number of elements in the list
        int n = scanner.nextInt();

        // Create an ArrayList to store the elements
        ArrayList<Integer> list = new ArrayList<>();

        // Read the initial elements
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        // Read the number of queries
        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            // Read the query type
            String queryType = scanner.next();

            if (queryType.equals("Insert")) {
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                list.add(index, value);/// * */
            } else if (queryType.equals("Delete")) {
                int index = scanner.nextInt();
                list.remove(index);
            }
        }

        // Print the modified list
        for (Integer num : list) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
