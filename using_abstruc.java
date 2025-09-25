// Class
class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

// Abstract Class
abstract class Car extends Vehicle {
    abstract void start(); // abstract method
    void stop() {          // concrete method
        System.out.println("Car stopped");
    }
}

// Interface
interface Electric {
    void charge();          // abstract method
    default void info() {   // default method
        System.out.println("Electric vehicle info");
    }
}

// Subclass implementing abstract class and interface
class Tesla extends Car implements Electric {
    void start() {
        System.out.println("Tesla started");
    }
    public void charge() {
        System.out.println("Tesla charging");
    }
}

// Main
public class using_abstruc {
    public static void main(String[] args) {
        Tesla t = new Tesla();
        t.start();
        t.stop();
        t.charge();
        t.info();
    }
}
