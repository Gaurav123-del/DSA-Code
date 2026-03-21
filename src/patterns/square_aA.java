package patterns;

import java.util.Scanner;

public class square_aA {
        public static void main(String[] args) {
            Scanner pat = new Scanner(System.in);
            System.out.print("Enter Number of row or col = ");
            int n = pat.nextInt();
            for (int i =1;i<=n;i++){
                for (int j =1;j<=n;j++){
                    if(i % 2 != 0 )
                    System.out.print((char)(i+96) +"  "); //ASCII values: A (uppercase) → 65 ; a (lowercase) → 97 .
                    else
                        System.out.print((char)(i+64) +"  ");
                }
                System.out.println();
            }
        }

}
