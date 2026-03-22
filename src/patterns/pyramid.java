// // METHODS ONE (MATH)
//package patterns;
//
//import java.util.Scanner;
//
//public class pyramid {
//
//    public static void main(String[] args) {
//        Scanner pat = new Scanner(System.in);
//        System.out.print("Enter Number of row or col = ");
//        int n = pat.nextInt();
//        for (int i =1;i<=n;i++){
//            for (int j =1;j<=n-i;j++){    // if print triangle then condition is  < j<= i >
//                System.out.print(" "+"  ");
//            }
//            for (int k=1 ;k<=(i*2)-1 ;k++){
//                System.out.print("*"+"  ");
//            }
//            System.out.println();
//        }
//    }
//
//}


//
// // METHODS Second  ( Not MATH)
//package patterns;
//
//import java.util.Scanner;
//
//public class pyramid {
//
//    public static void main(String[] args) {
//        Scanner pat = new Scanner(System.in);
//        System.out.print("Enter Number of row or col = ");
//        int n = pat.nextInt();
//        int nsp =n-1 ,nst=1 ;
//        for (int i =1;i<=n;i++){
//            for (int j =1;j<=nsp;j++){    // if print triangle then condition is  < j<= i >
//                System.out.print(" "+"  ");
//            }
//            for (int k=1 ;k<=nst ;k++){
//                System.out.print("*"+"  ");
//            }
//            nsp--;
//            nst += 2;
//            System.out.println();
//        }
//    }
//
//}

//
// // Number PYRAMID
//package patterns;
//
//import java.util.Scanner;
//
//public class pyramid {
//
//    public static void main(String[] args) {
//        Scanner pat = new Scanner(System.in);
//        System.out.print("Enter Number of row or col = ");
//        int n = pat.nextInt();
//        for (int i =1;i<=n;i++){
//            for (int j =1;j<=n-i;j++){    // if print triangle then condition is  < j<= i >
//                System.out.print(" "+"  ");
//            }
//            for (int k=1 ;k<=(i*2)-1 ;k++){
//                System.out.print(k+"  ");
//            }
//            System.out.println();
//        }
//    }
//
//}




// Number PYRAMID
package patterns;
import java.util.Scanner;

public class pyramid {

    public static void main(String[] args) {
        Scanner pat = new Scanner(System.in);
        System.out.print("Enter Number of row or col = ");
        int n = pat.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {    // if print triangle then condition is  < j<= i >
                System.out.print(" " + "  ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print((char) (i+64) + "  ");
            }
            System.out.println();
        }
    }
}
