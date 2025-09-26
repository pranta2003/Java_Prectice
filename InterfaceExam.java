import java.util.Scanner;

interface Calculator
{
	 final static double x=5,y=6;
	//abstract double sum(double e,double z);
        abstract double min(double e,double z);
        abstract double multi(double e,double z);
        abstract double div(double e,double z);

       
}

interface Summation
{
  double sum(double a, double b);
		
}



class InterfaceImplementedClass implements Calculator,Summation
{         
        double x,y;
	void hello()
	{
		System.out.println("This is Interface Implemented Class ");
	}

        public double sum(double a, double b)
         {
		x = a;
		y = b;
		double c = x+y;
		return c;
	} 
	
	public double multi(double a, double b)
	{
		x = a;
		y = b;
		double c = x*y;
		return c;
	}

       public double min(double a, double b)
	{
		x = a;
		y = b;
		double c = x-y;
		return c;
	}

        public double div(double a, double b)
	{
		x = a;
		y = b;
		double c = x/y;
		return c;
	}
}

class InterfaceExam
{
	public static void main(String [] args)
	{
		InterfaceImplementedClass c = new InterfaceImplementedClass();
		Scanner s = new Scanner(System.in);
                
                System.out.println("Enter Any Value:");
		double num1 = s.nextDouble();

                System.out.println("Enter Another Value:");
		double num2 = s.nextDouble();
		
	        c.hello();
		double temp = c.sum(num1,num2);
		System.out.println("Summation of a and b :"+temp);

                double temp1 = c.multi(num1,num2);
                System.out.println("Multiplication of a and b :"+temp1);
               
                double temp2 = c.min(num1,num2);
                System.out.println("Minus of a and b :"+temp2);
          
                double temp3 = c.div(num1,num2);
                System.out.println("Division of a and b :"+temp3);


	}
	
}
