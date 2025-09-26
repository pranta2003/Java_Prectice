interface A{  
void draw();  
}  
//Implementation: by second user  
class Rectangle implements A{  
public void draw(){System.out.println("Drawing rectangle");}  
}  
class Circle implements A{  
public void draw(){System.out.println("Drawing circle");}  
}  

class TestInterface_prectice{  
public static void main(String args[]){  
A d=new Circle();
A e=new Rectangle ();
d.draw();
e.draw();  
}} 
