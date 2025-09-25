class Car {
    // private field
    private String name;
    private int speed;

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Getter
    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }
}

public class getter_setter_method {
    public static void main(String[] args) {
        Car c = new Car();

        // Set values using setters
        c.setName("BMW");
        c.setSpeed(120);

        // Get values using getters
        System.out.println("Car: " + c.getName() + ", Speed: " + c.getSpeed());
    }
}
