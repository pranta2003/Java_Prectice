interface Animal {  
    abstract String sound(); //all classes that implement Animal must have a sound method
} 
 
class Cat implements Animal {      
    public String sound(){ //implemented sound method from the interface
        return "Meow!";
    }
} 
public class InterfaceExampleagain{

 public static void main(String args[])
    {
     Cat cat =new Cat();
     System.out.println("Sound of cat is "+cat.sound());
    }
}
