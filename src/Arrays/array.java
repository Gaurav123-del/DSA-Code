package Arrays;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        System.out.print("Enter thr length of array: ");
        int n = ar.nextInt();
        int[] arr =new int[n];
        System.out.print("Enter element: ");
        for (int i=0;i<n;i++) {
            arr[i] = ar.nextInt();
        }
            // print negative value
        System.out.print("Negative Number: ");
        for (int i=0;i<n;i++){
            if (arr[i]<0)
                System.out.println(arr[i]+" ");
        }
    }
}
