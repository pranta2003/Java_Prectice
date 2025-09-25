class Test {
    static final double PI = 3.14159;  // constant (shared + unchangeable)

    static int count = 0;
    final int id;

    Test(int id) {
        this.id = id; // final assigned once
        count++;
    }
}

public class using_final_static {
    public static void main(String[] args) {
        Test t1 = new Test(101);
        Test t2 = new Test(102);

        System.out.println("Count: " + Test.count); // static shared = 2
        System.out.println("t1 id: " + t1.id); // final unique
        System.out.println("t2 id: " + t2.id);
        System.out.println("PI: " + Test.PI);
    }
}
