import java.util.Scanner;
class Book {
    private String title;
    private String author;
    private String isbn;

    Book(String title, String author, String isbn) {
        this.title  = title;
        this.author = author;
        this.isbn = isbn;
    }

    boolean matchesTitle(String query) {
        return title.equalsIgnoreCase(query);
    }

    void displayDetails() {
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}

public class FindBook {
    public static void main(String[] args) {
        Book[] books = {
                new Book("Interview With The Vampire", "Anne Rice", "978-0132350884"),
                new Book("The Vampire Lestat", "Anne Rice", "978-0135957059"),
                new Book("Shatter Me","Tahereh Mafi","978-0134685991"),
                new Book("Heated Riverly","Rachel Reid","978-0596009205"),
                new Book("1984", "George Orwell", "978-1260440232")
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book title to search: ");
        String query = sc.nextLine();

        boolean found = false;
        for (Book b : books) {
            if (b.matchesTitle(query)) {
                System.out.println("Book found!");
                b.displayDetails();
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Book not found.");
    }
}
