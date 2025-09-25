class Student {
    String name;
    int age;

    // Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void show() {
        System.out.println(name + " is " + age + " years old.");
    }
}

public class constructor_java {
    public static void main(String[] args) {
        Student s1 = new Student("Pranta", 21);  // constructor is called automatically
        s1.show();
    }
}
