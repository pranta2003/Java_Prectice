/* Write a Java program that creates a class hierarchy for employees of a company.
The base class should be Employee, with subclasses Manager, Developer, and Programmer.
Each subclass should have properties such as name, address, salary, and job title.
Implement methods for calculating bonuses, generating performance reports, and managing projects.
*/

abstract class Employee {
    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;

    Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: $" + salary);
    }

    abstract double calculateBonus();
    abstract void performanceReport();
    abstract void manageProject(String projectName);
}

class Manager extends Employee {
    private int teamSize;

    Manager(String name, String address, double salary, String jobTitle, int teamSize) {
        super(name, address, salary, jobTitle);
        this.teamSize = teamSize;
    }

    @Override
    double calculateBonus() {
        return salary * 0.20; // Managers get 20% bonus
    }

    @Override
    void performanceReport() {
        System.out.println(jobTitle + " " + name + " is managing a team of " + teamSize + " employees efficiently.");
    }

    @Override
    void manageProject(String projectName) {
        System.out.println(name + " is managing the project: " + projectName);
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    Developer(String name, String address, double salary, String jobTitle, String programmingLanguage) {
        super(name, address, salary, jobTitle);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    double calculateBonus() {
        return salary * 0.15; // Developers get 15% bonus
    }

    @Override
    void performanceReport() {
        System.out.println(jobTitle + " " + name + " writes efficient code in " + programmingLanguage + ".");
    }

    @Override
    void manageProject(String projectName) {
        System.out.println(name + " is developing modules for the project: " + projectName);
    }
}

// Subclass Programmer
class Programmer extends Employee {
    private boolean isFullStack;

    Programmer(String name, String address, double salary, String jobTitle, boolean isFullStack) {
        super(name, address, salary, jobTitle);
        this.isFullStack = isFullStack;
    }

    @Override   //  if u want dont write override,thats okay.
    double calculateBonus() {
        return salary * 0.10; // Programmers get 10% bonus
    }

    @Override
    void performanceReport() {
        String stackInfo = isFullStack ? "full-stack capabilities" : "specialized skills";
        System.out.println(jobTitle + " " + name + " shows strong " + stackInfo + ".");
    }

    @Override
    void manageProject(String projectName) {
        System.out.println(name + " contributes programming expertise to the project: " + projectName);
    }
}

public class CompanyDemo {
    public static void main(String[] args) {
        // Create Manager
        Manager mgr = new Manager("Alice", "Dhaka", 120000, "Manager", 10);
        mgr.displayInfo();
        System.out.println("Bonus: $" + mgr.calculateBonus());
        mgr.performanceReport();
        mgr.manageProject("ERP System\n");

        // Create Developer
        Developer dev = new Developer("Bob", "Chittagong", 90000, "Developer", "Java");
        dev.displayInfo();
        System.out.println("Bonus: $" + dev.calculateBonus());
        dev.performanceReport();
        dev.manageProject("Mobile App\n");

        // Create Programmer
        Programmer prog = new Programmer("Charlie", "Khulna", 70000, "Programmer", true);
        prog.displayInfo();
        System.out.println("Bonus: $" + prog.calculateBonus());
        prog.performanceReport();
        prog.manageProject("Web Application\n");
    }
}

