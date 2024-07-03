/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cesar
 */
public class Book {
    private final String name;
    private final int pages;
    private final int year;
    
    public Book(String name, int pages, int year) {
        this.name = name;
        this.pages = pages;
        this.year = year;
    }
    
    public String toString() {
        return this.name + ", " + this.pages + " pages, " + this.year;
    }
    
    public String getName() {
        return this.name;
    }
    
}
