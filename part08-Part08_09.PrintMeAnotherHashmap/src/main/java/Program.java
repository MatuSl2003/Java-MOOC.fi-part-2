
import java.util.HashMap;
import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
//        HashMap<String, Book> hashmap = new HashMap<>();
//        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
//        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));
//        
//        printValues(hashmap);
//        System.out.println("---");
        ArrayList<Book> books = new ArrayList<>();
        Book bookObject = new Book("Book Object", 2000, "...");
        books.add(bookObject);

        if (books.contains(bookObject)) {
            System.out.println("Book Object was found.");
        }

        bookObject = new Book("Book Object", 2000, "...");

        if (!books.contains(bookObject)) {
            System.out.println("Book Object was not found.");
        }
    }

    public static void printValues(HashMap<String, Book> hashmap) {
        for (Book book : hashmap.values()) {
            System.out.println(book);
        }
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        for (Book book : hashmap.values()) {
            if (book.getName().contains(text)) {
                System.out.println(book);
            }
        }
    }
}
