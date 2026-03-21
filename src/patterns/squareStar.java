package patterns;

import java.util.Scanner;

public class squareStar {
    public static void main(String[] args) {
        Scanner pat = new Scanner(System.in);
        System.out.print("Enter Number of row or col = ");
        int n = pat.nextInt();
        for (int i =1;i<=n;i++){
            for (int j =1;j<=n;j++){
                System.out.print("*"+"  ");
            }
            System.out.println();
        }
    }
}
