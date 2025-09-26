 interface A{  
    void draw();  
    default void msg(){System.out.println("default method");}  
    }  
    class B implements A{  
    public void draw(){System.out.println("drawing rectangle");}  
    }  
    class InterfaceDefault1{  
    public static void main(String args[]){  
    A d=new B();  
    d.draw();  
    d.msg();  
    }}  
