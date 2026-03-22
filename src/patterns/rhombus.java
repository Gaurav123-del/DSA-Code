package patterns;

import java.util.Scanner;

public class rhombus {

    public static void main(String[] args) {
        Scanner pat = new Scanner(System.in);
        System.out.print("Enter Number of row or col = ");
        int n = pat.nextInt();
        for (int i =1;i<=n;i++){
            for (int j =1;j<=n-i;j++){    // if print triangle then condition is  < j<= i >
                System.out.print(" "+"  ");
            }
            for (int k=1 ;k<=n ;k++){
                System.out.print("*"+"  ");
            }
            System.out.println();
        }
    }

}
