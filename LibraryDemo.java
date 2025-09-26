/*
Write a Java program to create a class named Book that represents basic information about a book in a library. 
The class should have three attributes: title (String), author (String), and yearPublished (int). 
Include a constructor to initialize these fields and a method called displayInfo() that prints the book's details. In the main method,
create at least two objects of the Book class with different data and call the displayInfo() method for each to display their information.
*/

class Book {
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
        System.out.println("-----------------------------");
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
