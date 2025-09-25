class Parent {
    String name = "Parent";
}

class Child extends Parent {
    String name = "Child"; // shadows parent's variable

    void display() {
        System.out.println("Child name = " + name);      // Child
        System.out.println("Parent name = " + super.name); // Parent
    }
}

public class shadowing_in_inheritence {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
