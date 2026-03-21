//package patterns;
//
//import java.util.Scanner;
//
//public class specialTriangle1A_HW {
//    public static void main(String[] args) {
//        Scanner pat = new Scanner(System.in);
//        System.out.print("Enter Number of row or col = ");
//        int n = pat.nextInt();
//        for (int i =1;i<=n;i++){
//            for (int j =1;j<=i;j++){  // if print triangle then condition is  < j<= i >.
//                if(i % 2 != 0 )
//                    System.out.print(i +"  ");  // change < i >
//                else
//                    System.out.print((char)(i+64) +"  ");  // change < i >
//            }
//            System.out.println();
//        }
//    }
//
//}

package patterns;

import java.util.Scanner;

public class specialTriangle1A_HW {
    public static void main(String[] args) {
        Scanner pat = new Scanner(System.in);
        System.out.print("Enter Number of row or col = ");
        int n = pat.nextInt();
        for (int i =1;i<=n;i++){
            for (int j =1;j<=i;j++){  // if print triangle then condition is  < j<= i >.
                if(i % 2 != 0 )
                    System.out.print(j +"  "); //If ROW is same then print "i" and if COlUMN is same print "j"
                else
                    System.out.print((char)(j+64) +"  ");  //ASCII values: A (uppercase) → 65 ; a (lowercase) → 97 .
            }
            System.out.println();
        }
    }

}

