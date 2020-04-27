package ru.job4j.oop.pojo;

/**
 * Class data model object type Book
 * @author Aleksei Usov
 */

public class Book {
    private String name;
    private int countpage;

    //constructor object type Book
    public Book(String name, int countpage) {
        this.name = name;
        this.countpage = countpage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountpage() {
        return countpage;
    }

    public void setCountpage(int countpage) {
        this.countpage = countpage;
    }
}
