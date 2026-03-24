package Methods;

import java.util.Scanner;

public class builtIn {
    public static void main(String[] args) {
        //           MATH wale                   //
        //SquareRoot
        System.out.println(Math.sqrt(81));
        //CubeRoot
        System.out.println(Math.cbrt(125));
        // PI is not a methods or function , it is var
        System.out.println(Math.PI);
        //Make positive Number to Negative Number and vice verse
        System.out.println(Math.abs(-125));
        //Floor to find GIF (Greatest Integer Function )
        System.out.println(Math.floor(19.67)); // here Floor is 19
        System.out.println(Math.floor(-19.67));  // here Floor is -20
        // Ceil
        System.out.println(Math.ceil(3.04));  // Here Ceil is 4
        System.out.println(Math.cbrt(-10.547));  // Here Ceil is -10

        // To find MAX and MIN
        System.out.println(Math.min(10,20));
        System.out.println(Math.max(689876,689868));



        //Max of three Numbers
        Scanner met = new Scanner(System.in);
        System.out.print("enter first Number = ");
        int NUM1 = met.nextInt();
        System.out.print("enter second Number = ");
        int NUM2 = met.nextInt();
        System.out.print("enter Third Number = ");
        int NUM3 = met.nextInt();

        System.out.println(Math.max(  Math.max(NUM1,NUM2) , NUM3 ));

    }
}
