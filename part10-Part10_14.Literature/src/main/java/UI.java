/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mateo
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class UI {

    private Scanner scanner;
    private List<Book> books;

    public UI(Scanner scanner) {
        this.scanner = scanner;
        this.books = new ArrayList<>();
    }

    public void start() {
        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String bookName = this.scanner.nextLine();
            if (bookName.isEmpty()) {
                break;
            }
            System.out.print("input the age recommendation: ");
            int age = Integer.valueOf(this.scanner.nextLine());
            System.out.println("");
            Book newBook = new Book(age, bookName);
            this.books.add(newBook);
        }
        System.out.println("");
        System.out.println(books.size() + " books in total.");
        System.out.println("");
        System.out.println("Books: ");
        books.stream()
                .sorted((book1, book2) -> {
                    int ageDifference = Integer.compare(book1.getAgeRecommended(), book2.getAgeRecommended());
                    if(ageDifference == 0) {
                        return book1.getName().compareTo(book2.getName());
                    }
                    return book1.compareTo(book2);
                })
                .forEach(book -> System.out.println(book));

    }

}
