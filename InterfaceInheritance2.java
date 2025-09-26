 interface A{  
    void print();  
    }  
    interface B extends A{  
    void show();  
    }  
    class InterfaceInheritance2 implements B{  
    public void print(){System.out.println("Hello");}  
    public void show(){System.out.println("Welcome");}  
      
    public static void main(String args[]){  
    InterfaceInheritance obj = new InterfaceInheritance();  
    obj.print();  
    obj.show();  
     }  
    } 
