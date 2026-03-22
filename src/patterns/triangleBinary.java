package patterns;

import java.util.Scanner;

public class triangleBinary {
    public static void main(String[] args) {
        Scanner pat = new Scanner(System.in);
        System.out.print("Enter Number of row or col = ");
        int n = pat.nextInt();
        for (int i =1;i<=n;i++){
            for (int j =1; j<=i; j++){   // if print triangle then condition is  < j<= i >.
                if ((i+j) % 2 == 0)
                System.out.print("1" +"  ");  // If ROW is same then print "i" and if COlUMN is same print "j"
                else
                    System.out.print("0"+"  ");
            }
            System.out.println();
        }
    }
}
