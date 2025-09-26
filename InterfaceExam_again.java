class InterfaceExam_again
{ 
 public static void main(String [] args) {
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
