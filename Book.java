package com.company;
import java.lang.*;

public class Book {
    private String author;
    private int number_of_pages;

    public Book(String author, int number_of_pages) {
        this.author = author;
        this.number_of_pages = number_of_pages;
    }

    public Book(String author) {
        this.author = author;
        this.number_of_pages = -1;
    }

    public void setName(String author) {
        this.author = author;
    }

    public void setAge(int number_of_pages) {
        this.number_of_pages = number_of_pages;
    }

    public String getName() {
        return this.author;
    }

    public int getAge() {
        return this.number_of_pages;
    }

    public String toString() {
        return String.format("author: %s | number_of_pages: %d", this.author, this.number_of_pages);
    }

}
