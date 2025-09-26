import java.util.Scanner;
interface Calculator{
        final static double x=5,y=6;
        abstract double min(double e, double z);
        abstract double multi(double e, double z);
        abstract double div(double e, double z);
}
interface Summation
{
  double sum(double a, double b);
}
class InterfaceImplementedClass implements Calculator,Summation
{   
 double x,y;
 void hello(){System.out.println("This is Interface Implemented Class ");}
 public double sum(double a, double b)
         {x = a;
          y = b;
          double c = x+y;
          return c;}	
 public double multi(double a, double b)
	{x = a;
	 y = b;
	 double c = x*y;
	 return c; 
}
public double min(double a, double b)
	{ x = a;
	   y = b;
	   double c = x-y;
	   return c;
}
public double div(double a, double b)
	{x = a;
                y = b;
 	 double c = x/y;
	return c;
}
}
