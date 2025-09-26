import java.util.Scanner;

interface Calculator
{
    default void sum(double a, double b)
   {
      
      System.out.println("Summmation of a & b="+(a+b));
           
  }
    
abstract double minus(double c, double d);
abstract double multi(double e, double f);
}

interface AddingDiv
{
    abstract double div(double g, double h);
}
 class ImplenementInterface implements Calculator,AddingDiv 
 {
  double x,y;
  
  public double minus(double c, double d)
  {
      x=c;
      y=d;
      double temp=x-y;
      return temp;
      
      
  }
  public double multi(double e, double f)
  {
      return e*f;
      
  }
  public double div(double g, double h)
  {
      
    return g/h;  
      
  }
 }

public class InterfceExam_prectice {
    public static void main(String [] args){
    ImplenementInterface ob1 = new ImplenementInterface();
    Scanner s = new  Scanner(System.in);
    
    System.out.println("Enter a value=");
    double num1=s.nextDouble();
    
    System.out.println("Enter another value=");
    double num2=s.nextDouble();
    
    ob1.sum(num1,num2);
    
   double temp2 = ob1.minus(num1, num2);
   System.out.println("Minus of a & b="+temp2);
   
   double temp3 = ob1.multi(num1, num2);
   System.out.println("Multiplication of a & b="+temp3);
   
   double temp4 = ob1.div(num1, num2);
   System.out.println("Division of a & b="+temp4);
    
    }
}
