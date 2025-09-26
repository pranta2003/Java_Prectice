/*
Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). 
Create subclasses Circle and Triangle that extend the Shape class
and implement the respective methods to calculate the area and perimeter of each shape.
*/

abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();

    void displayInfo() {
        System.out.println("This is a " + this.getClass().getSimpleName());
    }
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape {
    private double sideA, sideB, sideC;

    Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    double calculateArea() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        circle.displayInfo();
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
        System.out.println();

        // Create Triangle
        Shape triangle = new Triangle(3, 4, 5);
        triangle.displayInfo();
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
    }
}
