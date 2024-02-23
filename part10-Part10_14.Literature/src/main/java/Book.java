/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mateo
 */
public class Book implements Comparable<Book> {

    private int ageRecommended;
    private String name;

    public Book(int ageRecommended, String name) {
        this.ageRecommended = ageRecommended;
        this.name = name;
    }

    public int getAgeRecommended() {
        return ageRecommended;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name + " (recommended for "
                + this.ageRecommended + " year-olds or older)";
    }
    
    @Override
    public int compareTo(Book book) {
        return this.ageRecommended - book.ageRecommended;
    }
}
