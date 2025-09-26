/*
You are tasked with developing a Student Management System 
where each student has certain private attributes such as name, age, studentID, and GPA. 
These attributes should be accessible only through methods 
that safely set and retrieve their values to ensure data encapsulation.
*/

class Student {
    private String name;
    private int age;
    private String studentID;
    private double gpa;

    public Student(String name, int age, String studentID, double gpa) {
        this.name = name;
        this.age = age;
        this.studentID = studentID;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name!");
        }
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    public String getStudentID() {
        return studentID;
    }
    public void setStudentID(String studentID) {
        if (studentID != null && !studentID.isEmpty()) {
            this.studentID = studentID;
        } else {
            System.out.println("Invalid student ID!");
        }
    }

    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("Invalid GPA! Must be between 0.0 and 4.0");
        }
    }

    public void displayInfo() {
        System.out.println("Name      : " + name);
        System.out.println("Age       : " + age);
        System.out.println("StudentID : " + studentID);
        System.out.println("GPA       : " + gpa);
        System.out.println("---------------------------");
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20, "S123", 3.8);
        Student s2 = new Student("Bob", 22, "S124", 3.5);

        s1.displayInfo();
        s2.displayInfo();

        s1.setAge(21);
        s1.setGpa(3.9);

        System.out.println("After updates:");
        s1.displayInfo();

        s2.setAge(-5);
        s2.setGpa(5.0);
    }
}
