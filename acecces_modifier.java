class  First{  
private int  x=20;  
private void m1(){System.out.println("Hello world");}  
}    
public class acecces_modifier{  
 public static void main(String args[]){  
    First  obj=new  First();  
   System.out.println(obj.x);  //Compile Time Error  
   obj.m1();   //Compile Time Error  
   }  
}
