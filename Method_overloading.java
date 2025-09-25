class Calculator {
    // Overloaded methods
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Method_overloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(5, 10));        // calls add(int,int)
        System.out.println(c.add(2.5, 3.7));    // calls add(double,double)
        System.out.println(c.add(1, 2, 3));     // calls add(int,int,int)
    }
}
