//Saved as First.java
package pack;  
Public class First{  
  protected void msg()
{System.out.println("Hello");}  
}  
//save as Second.java  
package mypack;  
import pack.*;  
class protected_access_mdifier extends First{  
  public static void main(String args[]){  
   Second obj = new Second();
   obj.msg();  
  }  
}  
