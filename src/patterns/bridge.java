package patterns;

import java.util.Scanner;

public class bridge {

    public static void main(String[] args) {
        Scanner pat = new Scanner(System.in);
        System.out.print("Enter Number of row or col = ");
        int n = pat.nextInt();

        int Col = 2 * n - 1;    // for  columns

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= Col; j++) {

                // first row → all stars
                if (i == 1) {   // first row → all stars
                    System.out.print("*"+"  ");
                }
                else if (j >= n - (i - 2) && j <= n + (i - 2)) {   // middle space
                    System.out.print(" "+"  ");
                }

                else {
                    System.out.print("*"+"  "); // remaining → stars
                }
            }
            System.out.println();
        }
    }
}
