class Parent {
    void display() {
        System.out.println("Parent display");
    }
}

class using_super_method_name extends Parent {
    void display() {
       super.display(); // calls parent display
        System.out.println("Child display");
    }
}
ob.display();





