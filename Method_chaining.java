class Car {
    String name;

    Car setName(String name) {
        this.name = name;
        return this; // return the current object
    }

    Car setSpeed(int speed) {
        System.out.println("Speed set to " + speed);
        return this; // return the current object
    }

    void show() {
        System.out.println("Car: " + name);
    }
}

public class Method_chaining {
    public static void main(String[] args) {
        Car c = new Car();
        c.setName("BMW").setSpeed(120).show(); // method chaining
    }
}
