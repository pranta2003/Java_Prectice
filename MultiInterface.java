interface A{  
    void print();  
    }  
    interface B{  
    void show();  
    }  
    class MultiInterface implements A,B{  
    public void print(){System.out.println("Hello from A");}  
    public void show(){System.out.println("Welcome from B");}  
      
    public static void main(String args[]){  
    MultiInterface obj = new MultiInterface ();  
    obj.print();  
    obj.show();  
     }  
    } 
