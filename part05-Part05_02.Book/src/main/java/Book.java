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

    private String author;
    private String name;
    private int page;

    public Book(String authors, String names, int pages) {
        author = authors;
        name = names;
        page = pages;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getPages() {
        return page;
    }

    public String toString() {
        return (author + ", " + name + ", " + page + " pages");
    }
}
