package patterns;

import java.util.Scanner;

public class triangleABC {
    public static void main(String[] args) {
        Scanner pat = new Scanner(System.in);
        System.out.print("Enter Number of row or col = ");
        int n = pat.nextInt();
        for (int i =1;i<=n;i++){
            for (int j =1;j<=i;j++){
                System.out.print( (char)(j+64) +"  ");  // If ROW is same then print "i" and if COlUMN is same print "j"
            }
            System.out.println();
        }
    }
}
