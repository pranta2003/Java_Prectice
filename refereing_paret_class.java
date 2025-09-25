class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class refereing_paret_class {
    public static void main(String[] args) {
        Animal a;   // reference of parent class

        a = new Dog();  // object of Dog
        a.sound();      // Output: Dog barks

        a = new Cat();  // object of Cat
        a.sound();      // Output: Cat meows
    }
}
