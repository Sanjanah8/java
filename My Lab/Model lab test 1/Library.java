import java.util.HashMap;
import java.util.Map;

class Library {
    private Map<String, Boolean> books;

    public Library() {
        books = new HashMap<>();
        books.put("Book 1", true);  // true means available
        books.put("Book 2", true);
        books.put("Book 3", false); // false means issued
    }

    public void issueBook(String bookName) {
        if (books.containsKey(bookName) && books.get(bookName)) {
            books.put(bookName, false);
            System.out.println(bookName + " has been issued.");
        } else {
            System.out.println(bookName + " is either not available or already issued.");
        }
    }

    public void returnBook(String bookName) {
        if (books.containsKey(bookName) && !books.get(bookName)) {
            books.put(bookName, true);
            System.out.println(bookName + " has been returned.");
        } else {
            System.out.println(bookName + " is either not part of the library or wasn't issued.");
        }
    }

    public void checkAvailability(String bookName) {
        if (books.containsKey(bookName)) {
            System.out.println(bookName + " is " + (books.get(bookName) ? "available" : "issued"));
        } else {
            System.out.println(bookName + " is not available in the library.");
        }
    }
}

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();
        library.issueBook("Book 1");
        library.returnBook("Book 1");
        library.checkAvailability("Book 2");
    }
}
