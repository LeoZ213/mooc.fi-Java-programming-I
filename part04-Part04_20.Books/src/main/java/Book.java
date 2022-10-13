/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lzhan
 */
public class Book {
    private String name;
    private int publication;
    private int pages;
    public Book(String name, int page, int publica) {
        this.name = name;
        this.publication = publica;
        this.pages = page;
    }
    @Override
    public String toString() {
        return this.name + ", " + this.pages + " pages, " + this.publication;        
    }
    public String title() {
        return this.name;
    }
}
