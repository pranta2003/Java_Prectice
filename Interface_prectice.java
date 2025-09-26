package pkginterface;
import java.util.Scanner;

interface Calculator
{ 
abstract float sum(float a, float b);
abstract float Min(float a, float b);
abstract float Multi(float a, float b);

default void msg(){System.out.println("Hello this is Defualt method ");}  
    }  


interface NewCalculator extends Calculator
{
    abstract float Div(float a, float b);
    
    static int cube(int x){return x*x*x;}
}
abstract class ModifiedCalculator implements NewCalculator
{
    float x,y;
public float sum(float a, float b)
{
x=a;
y=b;
return x+y;
}
public float Min(float a, float b)
{
x=a;
y=b;
return x-y;
}

}

class InterfaceImp extends ModifiedCalculator
{ 

public float Multi(float a, float b)
{
x=a;
y=b;
return x*y;
}

public float Div(float a, float b)
{
x=a;
y=b;
return x/y;
}

}

public class Interface_prectice {

   
    public static void main(String[] args) {
        
      InterfaceImp obj = new InterfaceImp();
      Scanner S =new Scanner(System.in);
      obj.msg();
    System.out.println("Enter any Two Values") ;
    float digit1=S.nextFloat();
    float digit2=S.nextFloat();
    
    float result= obj.sum(digit1, digit2);
    System.out.println("Sumation of two values is: "+result ) ;
    
     float result1= obj.Min(digit1, digit2);
    System.out.println("Minus of two values is: "+result1 ) ;
    
     float result2= obj.Multi(digit1, digit2);
    System.out.println("Multiplication of two values is: "+result2 ) ;
    
     float result3= obj.Div(digit1, digit2);
    System.out.println("Division of two values is: "+result3 ) ;
    
    System.out.println("Result of Static Method :"+NewCalculator.cube(3));
    }
}
