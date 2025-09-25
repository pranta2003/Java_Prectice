class Car {
    String name;
    int speed;

    Car() {
        this("Unknown", 0); // calling another constructor
    }

    Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    void show() {
        System.out.println("Car: " + name + ", Speed: " + speed);
    }
}

public class constructor_chaining {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("Tesla", 150);

        c1.show();
        c2.show();
    }
}
