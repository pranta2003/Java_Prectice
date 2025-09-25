// Product interface
interface Product {
    void getColour();   // no return, just print
}

// Colour class (like a datatype holder)
class Colour {
    String name;   // holds the colour name

    Colour(String name) {
        this.name = name;
    }
}

// Shelf class
class Shelf implements Product {
    Colour colour;   // Shelf "has a" Colour

    Shelf(Colour colour) {   // object passed as parameter
        this.colour = colour;
    }

    public void getColour() {
        System.out.println("Shelf colour: " + colour.name);
    }
}

// Desk class
class Desk implements Product {
    Colour colour;   // Desk "has a" Colour

    Desk(Colour colour) {
        this.colour = colour;
    }

    public void getColour() {
        System.out.println("Desk colour: " + colour.name);
    }
}

// Main class at the end
public class interface2 {
    public static void main(String[] args) {
        // Create Colour objects (like String, int, etc.)
        Colour brown = new Colour("Brown");
        Colour black = new Colour("Black");

        // Pass Colour objects to Shelf and Desk
        Product shelf = new Shelf(brown);
        Product desk  = new Desk(black);

        // Print results
        shelf.getColour();
        desk.getColour();
    }
}
