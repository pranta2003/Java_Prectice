/*
Write a Java program to create an abstract class Instrument with abstract methods play() and tune(). 
Create subclasses for Glockenspiel and Violin that extend the Instrument class
and implement the respective methods to play and tune each instrument.
*/

abstract class Instrument {
    abstract void play();
    abstract void tune();

    void info() {
        System.out.println("This is a " + this.getClass().getSimpleName());
    }
}

class Glockenspiel extends Instrument {
    @Override
    void play() {
        System.out.println("Playing the Glockenspiel: producing bright metallic tones.");
    }

    @Override
    void tune() {
        System.out.println("Tuning the Glockenspiel: adjusting the metal bars for correct pitch.");
    }
}

class Violin extends Instrument {
    @Override
    void play() {
        System.out.println("Playing the Violin: producing warm and expressive melodies.");
    }

    @Override
    void tune() {
        System.out.println("Tuning the Violin: tightening the strings to achieve correct pitch.");
    }
}

public class InstrumentDemo {
    public static void main(String[] args) {
        Instrument g = new Glockenspiel();
        g.info();
        g.play();
        g.tune();
        System.out.println();

        Instrument v = new Violin();
        v.info();
        v.play();
        v.tune();
    }
}

