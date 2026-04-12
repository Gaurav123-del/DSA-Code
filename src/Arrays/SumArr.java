package Arrays;

import java.util.Scanner;

public class SumArr {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        System.out.print("Enter thr length of array: ");
        int n = ar.nextInt();
        int[] arr =new int[n];
        System.out.print("Enter element: ");
        for (int i=0;i<n;i++) {
            arr[i] = ar.nextInt();
        }
        System.out.print("Sum of elements: ");
        int sum =0;
        for ( int i =0; i<n ;i++){
            sum +=arr[i];
        }
        System.out.println(sum);
    }
}
