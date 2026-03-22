// // SIMPLE METHODS
//package patterns;
//
//import java.util.Scanner;
//
//public class triangleVFStar {
//    public static void main(String[] args) {
//        Scanner pat = new Scanner(System.in);
//        System.out.print("Enter Number of row or col = ");
//        int n = pat.nextInt();
//        for (int i =1;i<=n;i++){
//            for (int j =1;j<=n;j++){    // if print triangle then condition is  < j<= i >.
//                if((i+j)>n)
//                System.out.print("*  ");
//                else
//                    System.out.print("   ");
//            }
//            System.out.println();
//        }
//    }
//}


// //DOING SELF
//package patterns;
//
//import java.util.Scanner;
//
//public class triangleVFStar {
//    public static void main(String[] args) {
//        Scanner pat = new Scanner(System.in);
//        System.out.print("Enter Number of row or col = ");
//        int n = pat.nextInt();
//        for (int i =1;i<=n;i++){
//            for (int j =1;j<=(n+1)-(i+1);j++){    // if print triangle then condition is  < j<= i >
//                System.out.print(" "+"  ");
//            }
//            for (int k=1 ;k<=(n+1)-(n-i+1) ;k++){
//                System.out.print("*"+"  ");
//            }
//            System.out.println();
//        }
//    }
//}


//STANDARD METHODS .
package patterns;

import java.util.Scanner;

public class triangleVFStar {
    public static void main(String[] args) {
        Scanner pat = new Scanner(System.in);
        System.out.print("Enter Number of row or col = ");
        int n = pat.nextInt();
        for (int i =1;i<=n;i++){
            for (int j =1;j<=n-i;j++){    // if print triangle then condition is  < j<= i >
                System.out.print("#"+"  ");
            }
            for (int k=1 ;k<=i ;k++){
                System.out.print("*"+"  ");
            }
            System.out.println();
        }
    }
}
