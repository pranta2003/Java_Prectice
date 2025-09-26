class Adder 
{ 
static int add(int a, int b) 
{ 
return a+b; 
} 
static int add(int a, int b, int c) 
{ 
return a+b+c;} 
}
class TestOverloading1 
{ 
public static void main(String[] args) { 
System.out.println(Adder.add(11,11)); 
  System.out.println(Adder.add(11,11,11)); } 
}
//• we have created two methods, first add() method performs addition of two numbers and second add method performs addition of three numbers.
//Method Overloading: changing data  type of arguments 
 class Adder 
 { 
 static int add(int a, int b) 
 {return a+b;} 
 static double add(double a, double b) • {return a+b;} 
 }
 class TestOverloading2 
 { 
 public static void main(String[] args) • { 
 System.out.println(Adder.add(11,11)); • System.out.println(Adder.add(12.3,12.6)); • } 
 }
