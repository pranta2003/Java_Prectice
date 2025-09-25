class Test {
    int x = 10; // instance variable

    void show() {
        int x = 20; // local variable (shadows the instance variable)
        System.out.println("Local x = " + x); // prints 20
        System.out.println("Instance x = " + this.x); // prints 10
    }
}

public class veriable_shawdoing2 {
    public static void main(String[] args) {
        Test t = new Test();
        t.show();
    }
}
