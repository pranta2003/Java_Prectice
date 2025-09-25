interface A {
    default void show() {
        System.out.println("From A");
    }
}

interface B extends A {
    default void show() {
        System.out.println("From B");
    }
}

interface C extends A {
    default void show() {
        System.out.println("From C");
    }
}

class D implements B, C {
    public void show() {
        // must override to resolve ambiguity
        B.super.show(); // or C.super.show()
    }
}

public class diamond_problem_solve {
    public static void main(String[] args) {
        D obj = new D();
        obj.show();  // explicitly chooses one
    }
}
