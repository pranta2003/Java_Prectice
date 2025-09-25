// variable shadowing
class Example {
    int x = 10; // instance variable

    void show(int x) { // parameter shadows instance variable
        System.out.println("Local x = " + x);      // refers to parameter
        System.out.println("Instance x = " + this.x); // refers to instance variable
    }

    void test() {
        int x = 50;  // local variable shadows instance variable
        System.out.println("Local x in test() = " + x);
        System.out.println("Instance x in test() = " + this.x);
    }
}

public class variable_shadwing {
    public static void main(String[] args) {
        Example obj = new Example();
        obj.show(100);
        obj.test();
    }
}
