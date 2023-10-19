public class balancedornot {
    public static void main(String[] args) {
        String[] expressions = { "<<>>", "<>", "<><>", "<<>" };
        int[] maxReplacements = { 0, 1, 2 };

        int array[] = new int[expressions.length];
        for (int i = 0; i < expressions.length; i++) {
            String x = expressions[i];
            char ch[] = x.toCharArray();
            int countleft = 0;
            int countright = 0;
            for (int j = 0; j < ch.length; j++) {
                if (ch[j] == '<') {
                    countleft++;
                } else if (ch[j] == '>') {
                    countright++;
                }
            }
            if (countleft == countright) {
                array[i] = 1;
            } else if (countleft != countright) {
                array[i] = 0;
            }
            {

            }

        }
        for (int val : array) {
            System.out.println(val);
        }
    }
}
