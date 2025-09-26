/*  Write a Java program to create a class called Shape with a method called Area(). 
Create a subclass called Rectangle that overrides the Area() method to calculate the area of a rectangle. 
*/

// Base class
class Shape {
    // Method to calculate area (generic)
    double Area() {
        System.out.println("Area is not defined for generic shape.");
        return 0;
    }
}

// Subclass Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override Area() method
    @Override
    double Area() {
        return length * width;
    }
}

public class inheritence_prectice6 {
    public static void main(String[] args) {
        // Create a Shape object
        Shape s = new Shape();
        s.Area(); // will show generic message

        // Create a Rectangle object
        Rectangle rect = new Rectangle(10, 5);
        System.out.println("Area of Rectangle = " + rect.Area());
    }
}
