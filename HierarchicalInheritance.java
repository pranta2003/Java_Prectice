// which code i fail to do in exam ;
class Animal
{  
void eat(){System.out.println("eating !!!");}  
}  
class Dog extends Animal{  
void bark(){System.out.println("barking !!!");}  
}  
class Cat extends Animal{  
void meow(){System.out.println("meowing !!!");}  
}  
class Human extends Animal{  
void run(){System.out.println("meowing !!!");}  
}  
class BabyCat extends Cat{  
void meow2(){System.out.println("meowing !!!");}  
}  


class HierarchicalInheritance
{  
   public static void main(String args[])
  {  
   Cat c=new Cat();  Dog d = new Dog()
   c.meow();  
   c.eat();  
  //d.bark();    //Compile Time Error  
  }
}

*/
Output :
meowing !!!
eating !!!
/*
 
