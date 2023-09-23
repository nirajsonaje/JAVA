package patterns;

import java.util.Scanner;

public class sq_lad_tb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int rows=1;rows<=n;rows++){
            for(int col=1;col<=n;col++){
                    if(col==n||col==1||rows%2!=0){
                        System.out.print("*\t");
                    }
                    else{
                        System.out.print("\t");
                    }
                  
            }
            System.out.println();
        }
    }
}
