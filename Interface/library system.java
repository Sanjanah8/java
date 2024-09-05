// LibraryItem interface
interface LibraryItem {
    void borrowItem();
    void returnItem();
    void printDetails();
}

// Book class
class Book implements LibraryItem {
    private String title;
    private int borrowLimit = 14;  // 14 days borrowing limit for books

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void borrowItem() {
        System.out.println("Borrowed book: " + title + " for " + borrowLimit + " days.");
    }

    @Override
    public void returnItem() {
        System.out.println("Returned book: " + title);
    }

    @Override
    public void printDetails() {
        System.out.println("Book Title: " + title + ", Borrow Limit: " + borrowLimit + " days");
    }
}

// Journal class
class Journal implements LibraryItem {
    private String title;
    private int borrowLimit = 7;  // Journals have 7 days borrowing limit

    public Journal(String title) {
        this.title = title;
    }

    @Override
    public void borrowItem() {
        System.out.println("Borrowed journal: " + title + " for " + borrowLimit + " days.");
    }

    @Override
    public void returnItem() {
        System.out.println("Returned journal: " + title);
    }

    @Override
    public void printDetails() {
        System.out.println("Journal Title: " + title + ", Borrow Limit: " + borrowLimit + " days");
    }
}

// DVD class
class DVD implements LibraryItem {
    private String title;
    private int borrowLimit = 5;  // DVDs have 5 days borrowing limit

    public DVD(String title) {
        this.title = title;
    }

    @Override
    public void borrowItem() {
        System.out.println("Borrowed DVD: " + title + " for " + borrowLimit + " days.");
    }

    @Override
    public void returnItem() {
        System.out.println("Returned DVD: " + title);
    }

    @Override
    public void printDetails() {
        System.out.println("DVD Title: " + title + ", Borrow Limit: " + borrowLimit + " days");
    }
}

// Main class
public class LibrarySystem {
    public static void main(String[] args) {
        LibraryItem book = new Book("Java Programming");
        LibraryItem journal = new Journal("Scientific American");
        LibraryItem dvd = new DVD("The Matrix");

        book.borrowItem();
        journal.borrowItem();
        dvd.borrowItem();

        book.printDetails();
        journal.printDetails();
        dvd.printDetails();

        book.returnItem();
        journal.returnItem();
        dvd.returnItem();
    }
}
