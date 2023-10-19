package no_problems;

public class swapxyz {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;

        x = x + y + z;
        y = x - y - z;
        z = x - y - z;
        x = x - y - z;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
// other approach
// int temp=z;
// z=y;
// y=x;
// x=temp;
