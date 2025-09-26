 interface A{  
    void print();  
    }  
    interface B{  
    void show();  
    }  
    class MultiInterface3 implements A,B
{  
    public void print()
{System.out.println("Hello from A");}  
    public void show()
{System.out.println("Welcome from B");}  
