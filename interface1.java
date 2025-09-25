// interfece type
// Product interface
interface Product {
    void getColour();
}

// Colour class
class Colour {
    String name;

    Colour(String name) {
        this.name = name;
    }
}

// Shelf class
class Shelf implements Product {
    Colour colour;   // has a Colour

    Shelf(String colourName) {   // pass only String
        colour = new Colour(colourName);   // create Colour object here
    }

    public void getColour() {
        System.out.println("Shelf colour: " + colour.name);
    }
}

// Desk class
class Desk implements Product {
    Colour colour;

    Desk(String colourName) {   // pass only String
        colour = new Colour(colourName);   // create Colour object here
    }

    public void getColour() {
        System.out.println("Desk colour: " + colour.name);
    }
}

// Main class last
public class interface1 {
    public static void main(String[] args) {
        Product shelf = new Shelf("Brown");  // just pass String
        Product desk  = new Desk("Black");

        shelf.getColour();
        desk.getColour();
    }
}
