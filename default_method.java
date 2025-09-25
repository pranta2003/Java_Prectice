interface Vehicle {
    void start(); // abstract method

    default void stop() { // non-abstract method
        System.out.println("Vehicle stopped");
    }
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car started");
    }
}

public class default_method {
    public static void main(String[] args) {
        Car c = new Car();
        c.start(); // abstract method implemented
        c.stop();  // inherited default method
    }
}
