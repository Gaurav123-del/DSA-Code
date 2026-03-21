package patterns;

import java.util.Scanner;

public class rectangleHollow {
    public static void main(String[] args) {
        Scanner pat = new Scanner(System.in);
        System.out.print("Enter number of row = ");
        int row = pat.nextInt();
        System.out.print("Enter number of column = ");
        int col = pat.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if(i==1 || i==row || j==1 || j==col )
                   System.out.print("*"+" " );
                else
                    System.out.print(" "+" ");
            }
            System.out.println();
        }
    }
}
