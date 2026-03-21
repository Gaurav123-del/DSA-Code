package patterns;

import java.util.Scanner;

public class triangleFH_Num {

    public static void main(String[] args) {
        Scanner pat = new Scanner(System.in);
        System.out.print("Enter Number of row or col = ");
        int n = pat.nextInt();
        for (int i =1;i<=n;i++){
            for (int j =1;j<=n+1-i;j++){    // if print Flip Horizontal triangle then condition is  < j<= n+1 -i >.
                System.out.print(j+"  ");// to print Numbers ,If ROW is same then print "i" and if COlUMN is same print "j"
            }
            System.out.println();
        }
    }
}
