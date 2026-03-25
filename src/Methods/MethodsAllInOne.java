package Methods;

public class MethodsAllInOne {

    // 1. No Parameter, No Return Type
    public static void type1() {
        System.out.println("Type1: No Parameter, No Return");
    }

    // 2. With Parameters, No Return Type
    public static void type2(int a, int b) {
        System.out.println("Type2 Sum = " + (a + b));
    }

    // 3. No Parameter, With Return Type
    public static int type3() {
        return 100;
    }

    // 4. With Parameters, With Return Type
    public static int type4(int a, int b) {
        return a * b;
    }

    // 5. Static Method
    public static void staticMethod() {
        System.out.println("This is a static method");
    }

    // 6. Instance Method (Non-static)
    public void instanceMethod() {
        System.out.println("This is an instance method");
    }

    // 7. Constructor
    MethodsAllInOne() {
        System.out.println("Constructor called");
    }

    // 8. Method Overloading
    public static void add(int a, int b) {
        System.out.println("Overloading (2 params): " + (a + b));
    }

    public static void add(int a, int b, int c) {
        System.out.println("Overloading (3 params): " + (a + b + c));
    }

    // Main Method
    public static void main(String[] args) {

        // Type 1
        type1();

        // Type 2
        type2(10, 20);

        // Type 3
        int value = type3();
        System.out.println("Type3 Return = " + value);

        // Type 4
        int result = type4(5, 6);
        System.out.println("Type4 Multiply = " + result);

        // Static Method
        staticMethod();

        // Object creation (Constructor + Instance Method)
        MethodsAllInOne obj = new MethodsAllInOne();
        obj.instanceMethod();

        // Method Overloading
        add(2, 3);
        add(1, 2, 3);
    }
}