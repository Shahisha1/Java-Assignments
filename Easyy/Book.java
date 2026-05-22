class Books {
    String title;
    String author;

    Books(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void showBook() {
        System.out.println("Title:  " + title);
        System.out.println("Author: " + author);
    }
}
public class Book {
    public static void main(String[] args) {
        Books b = new Books("Interview with the Vampire", "Anne Rice");
        b.showBook();
    }
}
