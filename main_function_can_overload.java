public class main_function_can_overload {
    public static void main(String[] args) {  // JVM entry point
        System.out.println("Main with String[] args");
        main(5);   // calling overloaded main
    }

    public static void main(int x) {
        System.out.println("Main with int: " + x);
    }

    public static void main(String s) {
        System.out.println("Main with String: " + s);
    }
}
