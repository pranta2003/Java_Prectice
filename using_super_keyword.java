class Parent {
    Parent(String name) {
        System.out.println("Parent constructor: " + name);
    }
}

class Child extends Parent {
    Child() {
String s;
        super("Maharin"); // calls Parent constructor
        System.out.println("Child constructor");
    }
}

public class using_super_keyword {
    public static void main(String[] args) {
 Child c= new Child();
    }
}
/*
Output:
Parent constructor: Maharin
Child constructor
*/
