 class Vehicle{ 
 void run(){System.out.println("Vehicle is runn ing");} } 
class Bike extends Vehicle{ 
 public static void main(String args[]){ • Bike obj = new Bike(); 
 obj.run(); 
 } }
//Example of method overriding 
 class Vehicle_method_overriding{ 
 void run(){System.out.println("Vehicle is running");} } • class Bike2 extends Vehicle{ 
 void run(){System.out.println("Bike is running safely");} 
 public static void main(String args[]){ 
 Bike2 obj = new Bike2(); 
 obj.run(); 
 }
