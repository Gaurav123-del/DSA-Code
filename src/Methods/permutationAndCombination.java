//package Methods;
//
//import java.util.Scanner;
//
//public class permutationAndCombination {
//    public static void main(String[] args) {
//        Scanner meth = new Scanner(System.in);
//        int n = meth.nextInt();
//        int r = meth.nextInt();
//
//        int nFact =1;
//        for (int i=1;i<=n;i++){
//            nFact *=i;
//        }
//        int rFact =1;
//        for (int i=1;i<=r;i++){
//            rFact *=i;
//        }
//        int NMinR =1;
//        for (int i=1;i<=n-r;i++){
//            NMinR *=i;
//        }
//        int ncr = nFact/(rFact*NMinR);
//        System.out.println(ncr);
//    }
//
//}



//  use Methods

package Methods;

import java.util.Scanner;

public class permutationAndCombination {
    public static int fact (int x){
        int f =1;
        int nFact =1;
        for (int i=1;i<=x;i++){
            f *=i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner meth = new Scanner(System.in);
        int n = meth.nextInt();
        int r = meth.nextInt();

        int ncr = fact(n)/fact(r)*fact(n-r);
        int npr = fact(n)/fact(n-r);
        System.out.println(ncr);
        System.out.println(npr);
    }

}
