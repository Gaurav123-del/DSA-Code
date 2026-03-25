package Methods;

import java.util.Scanner;

public class Syntax {

    // Method without parameters
    public static void sum() {
        int a = 10;
        int b = 20;
        System.out.println("Sum = " + (a + b));
    }

    // Method without parameters
    public static void Multiply() {
        int a = 10;
        int b = 20;
        System.out.println("Multiplication = " + (a * b));
    }

    // Method with parameters
    public static void subtract(int a, int b) {
        System.out.println("Subtraction = " + (a - b));
    }

    // Method with return type
    public static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a / b;
    }

    // Method to find even or odd
    public static void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }

    // Method to find factorial
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method using user input
    public static void userInputSum() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("User Sum = " + (a + b));
    }

    // Main method
    public static void main(String[] args) {

        sum();
        Multiply();

        subtract(50, 20);

        int result = divide(40, 5);
        System.out.println("Division = " + result);

        checkEvenOdd(7);

        int fact = factorial(5);
        System.out.println("Factorial = " + fact);

        userInputSum();
    }
}