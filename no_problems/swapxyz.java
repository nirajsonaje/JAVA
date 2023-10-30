package no_problems;

public class swapxyz {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;

        x = x + y + z;// 60
        y = x - y - z;// 60-20-30//10
        z = x - y - z;// 60-10-30//20
        x = x - y - z;// 60-10-20//30
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
