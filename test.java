import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int n1 = sc.nextInt();
        int arr2[] = new int[1];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; i < arr2.length; j++) {
                if (arr1[i] - arr2[j] == 0) {
                    System.out.print(arr1[i]);
                }
            }
        }
    }
}
