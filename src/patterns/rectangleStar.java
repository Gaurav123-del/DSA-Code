package patterns;

import java.util.Scanner;

public class rectangleStar {
    public static void main(String[] args) {
        Scanner pat = new Scanner(System.in);
        System.out.println("Enter number of row ");
        int row = pat.nextInt();
        System.out.println("Enter number of column ");
        int col = pat.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print("*" +" ");
            }
            System.out.println();
        }
    }
}
