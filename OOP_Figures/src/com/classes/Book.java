package com.classes;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Objects;

public class Book {
    String name;
    double price;
    private Author[] authors;
    int qty;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        String tmp = "";
        for (Author str: authors)
            tmp += str + ", ";

        return "Book[name = " + name + ", authors = " + tmp + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Book book = (Book) o;
        return qty == book.qty && name.equals(book.name) &&
                Arrays.equals(authors, book.authors) && Double.compare(book.price, price) == 0;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + Arrays.hashCode(authors);
        result = 31 * result + Objects.hash(name, price, qty);
        return result;
    }
}
