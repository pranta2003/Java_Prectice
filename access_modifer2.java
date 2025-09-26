class Second{  
private Second(){} //private constructor  
void m1(){System.out.println("Hello World");}  
}  
public class access_modifer2{  
 public static void main(String args[]){  
    Second  obj=new  Second();//Compile Time Error  
 }  
}  
