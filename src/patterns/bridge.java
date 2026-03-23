// // EXTRA VARIABLE  < col >
// package patterns;
//
//import java.util.Scanner;
//
//public class bridge {
//
//    public static void main(String[] args) {
//        Scanner pat = new Scanner(System.in);
//        System.out.print("Enter Number of row or col = ");
//        int n = pat.nextInt();
//
//        int Col = 2 * n - 1;    // for  columns
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= Col; j++) {
//
//                // first row → all stars
//                if (i == 1) {   // first row → all stars
//                    System.out.print("*"+"  ");
//                }
//                else if (j >= n - (i - 2) && j <= n + (i - 2)) {   // middle space
//                    System.out.print(" "+"  ");
//                }
//
//                else {
//                    System.out.print("*"+"  "); // remaining → stars
//                }
//            }
//            System.out.println();
//        }
//    }
//}


//  //Use Math
//
//package patterns;
//
//import java.util.Scanner;
//
//public class bridge {
//
//    public static void main(String[] args) {
//        Scanner pat = new Scanner(System.in);
//        System.out.print("Enter Number of row or col = ");
//        int n = pat.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//
//            // Left stars
//            for (int j = 1; j <= n - i + 1; j++) {
//                System.out.print("*  ");
//            }
//
//            //  Middle dashes (only from 2nd row)
//            for (int j = 1; j <= 2 * i - 3; j++) {
//                {
//                    System.out.print("   ");
//                }
//            }
//
//            //  Right stars
//            for (int k = 1; k <= n - i +1; k++) {
//                if( i==1 && k==5)   // Use to remove one extra STAR
//                    System.out.print("   ");
//                else
//                    System.out.print("*  ");
//            }
//
//            System.out.println();
//        }
//    }
//}


 // STANDARD METHODS

package patterns;

import java.util.Scanner;

public class bridge {

    public static void main(String[] args) {
        Scanner pat = new Scanner(System.in);
        System.out.print("Enter Number of row or col = ");
        int n = pat.nextInt();
        for (int i = 1; i <= 2*n-1; i++) {
            System.out.print("*"+"  ");
        }
        System.out.println();

        int nsp =1;
        for (int i = 1; i <= n-1; i++) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print("*  ");
            }

            //  Middle dashes (only from 2nd row)
            for (int j = 1; j <=nsp; j++) {
                {
                    System.out.print("   ");
                }
            }

            //  Right stars
            for (int k = 1; k <= n - i; k++) {

                System.out.print("*  ");
            }
            nsp += 2;
            System.out.println();
        }
    }
}
