/*
Write a Java program to create a vehicle class hierarchy. 
The base class should be Vehicle, with subclasses Truck, Car and Motorcycle.
Each subclass should have properties such as make, model, year, and fuel type.
Implement methods for calculating fuel efficiency, distance traveled, and maximum speed. 
*/

// Base class Vehicle
abstract class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected String fuelType;

    // Constructor
    Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    abstract double fuelEfficiency(); 
    abstract double maxSpeed();      

    // Common method: distance traveled based on fuel available
    double distanceTraveled(double litersOfFuel) {
        return litersOfFuel * fuelEfficiency();
    }

    void displayInfo() {
        System.out.println(year + " " + make + " " + model + " (" + fuelType + ")");
    }
}

class Truck extends Vehicle {
    private double loadCapacity; // in tons

    Truck(String make, String model, int year, String fuelType, double loadCapacity) {
        super(make, model, year, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    double fuelEfficiency() {
        return 5.0; // trucks generally consume more fuel
    }

    @Override
    double maxSpeed() {
        return 120.0;
    }
}

// Subclass Car
class Car extends Vehicle {
    private int passengerCapacity;

    Car(String make, String model, int year, String fuelType, int passengerCapacity) {
        super(make, model, year, fuelType);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    double fuelEfficiency() {
        return 15.0; // average car efficiency
    }

    @Override
    double maxSpeed() {
        return 180.0;
    }
}

class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    Motorcycle(String make, String model, int year, String fuelType, boolean hasSidecar) {
        super(make, model, year, fuelType);
        this.hasSidecar = hasSidecar;
    }

    @Override
    double fuelEfficiency() {
        return 35.0; // motorcycles are very fuel efficient
    }

    @Override
    double maxSpeed() {
        return 160.0;
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        // Create objects
        Truck t = new Truck("Volvo", "FH16", 2022, "Diesel", 18);
        Car c = new Car("Toyota", "Corolla", 2023, "Petrol", 5);
        Motorcycle m = new Motorcycle("Yamaha", "R15", 2021, "Petrol", false);

        // Display info and test methods
        t.displayInfo();
        System.out.println("Truck fuel efficiency: " + t.fuelEfficiency() + " km/l");
        System.out.println("Truck max speed: " + t.maxSpeed() + " km/h");
        System.out.println("Truck can travel " + t.distanceTraveled(50) + " km with 50 liters\n");

        c.displayInfo();
        System.out.println("Car fuel efficiency: " + c.fuelEfficiency() + " km/l");
        System.out.println("Car max speed: " + c.maxSpeed() + " km/h");
        System.out.println("Car can travel " + c.distanceTraveled(30) + " km with 30 liters\n");

        m.displayInfo();
        System.out.println("Motorcycle fuel efficiency: " + m.fuelEfficiency() + " km/l");
        System.out.println("Motorcycle max speed: " + m.maxSpeed() + " km/h");
        System.out.println("Motorcycle can travel " + m.distanceTraveled(10) + " km with 10 liters\n");
    }
}
