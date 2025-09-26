 interface A{  
    void draw();  
    static int cube(int x){return x*x*x;}  
    }  
    class B implements A{  
    public void draw(){System.out.println("drawing rectangle");}  
    }  
      
    class InterfaceStatic_prectice{  
    public static void main(String args[]){  
    A d=new B();  
    d.draw();  
    System.out.println(A.cube(3));  
    }}
