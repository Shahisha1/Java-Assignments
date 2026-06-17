class LibraryItem {
    private String title;
    private String author;
    private int id;

    public LibraryItem(String title, String author, int id) {
        this.title = title;
        this.author = author;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getId() {
        return id;
    }

    public void getInfo() {
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Book extends LibraryItem {
    private int pages;

    public Book(String title, String author, int id, int pages) {
        super(title, author, id);
        this.pages = pages;
    }

    @Override
    public void getInfo() {
        System.out.println("[BOOK]");
        super.getInfo();
        System.out.println("Pages: " + pages);
    }
}

class Magazine extends LibraryItem {
    private String publicationFrequency;
    private int issueNumber;

    public Magazine(String title, String author, int id, String publicationFrequency, int issueNumber) {
        super(title, author, id);
        this.publicationFrequency = publicationFrequency;
        this.issueNumber = issueNumber;
    }

    @Override
    public void getInfo() {
        System.out.println("[MAGAZINE]");
        super.getInfo();
        System.out.println("Published: " + publicationFrequency);
        System.out.println("Issue Number: " + issueNumber);
    }
}

class Newspaper extends LibraryItem {
    private String publishDate;
    private String city;

    public Newspaper(String title, String author, int id, String publishDate, String city) {
        super(title, author, id);
        this.publishDate = publishDate;
        this.city = city;
    }

    @Override
    public void getInfo() {
        System.out.println("[NEWSPAPER]");
        super.getInfo();
        System.out.println("Published On: " + publishDate);
        System.out.println("City Edition: " + city);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        LibraryItem[] catalog = {
            new Book("Interview With the Vampire ", "Anne Rice", 1, 180),
            new Magazine("Vogue", "Anna Wintour", 2, "per yeaar 8", 342),
            new Newspaper("The Daily Bugle", "J. Jonah Jameson", 3, "2025-06-09", "New York")
        };

        System.out.println("Library Catalog");
        for (LibraryItem item : catalog)  {
            item.getInfo();
        }
    }
}
