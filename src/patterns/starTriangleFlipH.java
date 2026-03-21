//// ONE MORE METHOD ( "BUT NOT STANDARD" )
//
//
//package patterns;
//
//import java.util.Scanner;
//
//public class starTriangleFlipH {
//
//    public static void main(String[] args) {
//        Scanner pat = new Scanner(System.in);
//        System.out.print("Enter Number of row or col = ");
//        int n = pat.nextInt();
//        for (int i =1;i<=n;i++){
//            for (int j =n;j>=i;j--){    // This condition is not standard bcz if we use this condition in Alphabets and Numbers then ,it will not give appropriate output
//                System.out.print("*"+"  ");
//            }
//            System.out.println();
//        }
//    }
//}


// STANDARD METHODS
package patterns;

import java.util.Scanner;

public class starTriangleFlipH {

    public static void main(String[] args) {
        Scanner pat = new Scanner(System.in);
        System.out.print("Enter Number of row or col = ");
        int n = pat.nextInt();
        for (int i =1;i<=n;i++){
            for (int j =1;j<=n+1-i;j++){    // if print Flip Horizontal triangle then condition is  < j<= n+1 -i >.
                System.out.print("*"+"  ");
            }
            System.out.println();
        }
    }
}



