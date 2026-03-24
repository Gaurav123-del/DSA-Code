//package Methods;

//import java.util.Scanner;
//
//public class maxNumber {
//    public static void main(String[] args) {
//
//        //Max of three Numbers
//
//        Scanner met = new Scanner(System.in);
//        System.out.print("enter first Number = ");
//        int NUM1 = met.nextInt();
//        System.out.print("enter second Number = ");
//        int NUM2 = met.nextInt();
//        System.out.print("enter Third Number = ");
//        int NUM3 = met.nextInt();
//
//        System.out.println(Math.max(  Math.max(NUM1,NUM2) , NUM3 ));
//    }
//}

package Methods;

import java.util.Scanner;

public class maxNumber {
    public static void main(String[] args) {

        //Max of three Numbers

        Scanner met = new Scanner(System.in);
        System.out.print("enter first Number = ");
        int NUM1 = met.nextInt();
        System.out.print("enter second Number = ");
        int NUM2 = met.nextInt();
        System.out.print("enter Third Number = ");
        int NUM3 = met.nextInt();
        System.out.print("enter four Number = ");
        int NUM4 = met.nextInt();

        System.out.println( Math.max(     Math.max(NUM1,NUM2) , Math.max(NUM3,NUM4)    ) );
    }
}