interface Vehicle {
    // Abstract method with parameter
    void start(String vehicleName);

    // Default method with parameter
    default void stop(String vehicleName) {
        System.out.println(vehicleName + " stopped");
    }
}

class Car implements Vehicle {
    // Implement abstract method
    public void start(String vehicleName) {
        System.out.println(vehicleName + " started");
    }
}

public class interface_perameters {
    public static void main(String[] args) {
        Car c = new Car();
        
        // Pass parameters to methods
        c.start("Toyota"); // abstract method implemented
        c.stop("Toyota");  // inherited default method
    }
}
