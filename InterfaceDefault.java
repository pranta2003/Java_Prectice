//interface with class diverse
interface A {  
    void draw();  // abstract method
    default void msg() { System.out.println("default method"); }  // default method
}  

class B implements A {  
    public void draw() { System.out.println("drawing rectangle"); }  
}  

class InterfaceDefault {  
    public static void main(String args[]) {  
        A d = new B();  // reference of interface type
        d.draw();        // calls B's draw() implementation
        d.msg();         // calls default method in interface A
    }  
}
