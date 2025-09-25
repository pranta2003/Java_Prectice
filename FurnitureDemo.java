// UML -> Java: Product (interface) , Colour (class), Shelf and Desk (implement Product)
// All in one file; only FurnitureDemo is public so file name should be FurnitureDemo.java

public class FurnitureDemo {
    public static void main(String[] args) {
        Colour red = new Colour("Red");
        Colour oak = new Colour("Oak");

        // create products
        Product shelf = new Shelf(red);
        Product desk  = new Desk(oak);

        // demonstrate getColour()
        System.out.println("Shelf colour: " + shelf.getColour()); // uses Colour.toString()
        System.out.println("Desk colour:  " + desk.getColour());

        // show we can change the colour if needed
        ((Shelf) shelf).setColour(new Colour("Dark Red"));
        System.out.println("Shelf new colour: " + shelf.getColour());
    }
}

// UML: <<interface>> Product
interface Product {
    Colour getColour();
}

class Colour {
    private String colour;

    public Colour(String colour) {
        this.colour = colour;
    }

    public String getColourString() {
        return colour;
    }

    public void setColourString(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return colour;
    }
}

// UML: Shelf has "Colour colour" and implements Product
class Shelf implements Product {
    private Colour colour;

    public Shelf(Colour colour) {
        this.colour = colour;
    }

    @Override
    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }
}

// UML: Desk has "Colour colour" and implements Product
class Desk implements Product {
    private Colour colour;

    public Desk(Colour colour) {
        this.colour = colour;
    }

    @Override
    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }
}
