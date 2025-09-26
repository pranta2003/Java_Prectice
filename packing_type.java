//Saved as First.java
package pack;  
class A{  
  void msg(){System.out.println("Hello");}  
}  


//save as Second.java  
package mypack;  
import pack.*;  
class packing_type{  
  public static void main(String args[]){  
   A obj = new A();//Compile Time Error  
   obj.msg();//Compile Time Error  
  }  
}  
