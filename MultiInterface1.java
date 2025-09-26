 interface A
{  
    void print();  
}  
    interface B
{  
    void print();  
    }  
      
    class MultiInterface1 implements A,B
{  
    public void print()
    {System.out.println("Hello");} 
 
    public static void main(String args[])
    {  
    MultiInterface1 obj = new MultiInterface1();  
    obj.print();  
     }  
    }
