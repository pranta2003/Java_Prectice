/*
Design a MetroTicket class to simulate a metro ticket booking system using constructor overloading.
Passengers can book tickets with different levels of information: some may provide only their name,
source, and destination; others may include whether it’s a round trip, choose between "Regular" or "Premium" seat classes,
and even apply discount codes. The class should have four overloaded constructors to handle these scenarios.
Use constructor chaining to avoid code repetition. Include validations—for instance, seat class must be either "Regular" or "Premium",
and if an invalid value is given, default to "Regular".
Implement methods like calculateFare() to compute the fare based on trip type and seat class (e.g., one-way Regular = 100, Premium = 150; 
round-trip Regular = 180, Premium = 270), with a 10% discount if the code "DIS10" is applied. 
Also, write a displayTicketDetails() method to show all ticket information. 
Create at least four objects using different constructors to demonstrate constructor overloading effectively.
*/

// Book class
class Book {
    // Attributes
    private String title;
    private String author;
    private int yearPublished;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public void displayInfo() {
        System.out.println("Title         : " + title);
        System.out.println("Author        : " + author);
        System.out.println("Year Published: " + yearPublished);
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", "Paulo Coelho", 1988);
        Book book2 = new Book("1984", "George Orwell", 1949);

        book1.displayInfo();
        book2.displayInfo();
    }
}
