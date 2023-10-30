public class reversendigitno {
    public static void main(String[] args) {
        int n = 152;
        int result = 0;
        while (n > 0) {
            result = result * 10 + n % 10;
            // 2
            // 2*10+5=25
            // 25*10+1=251
            n /= 10;
        }
        System.out.println(result);
    }
}
