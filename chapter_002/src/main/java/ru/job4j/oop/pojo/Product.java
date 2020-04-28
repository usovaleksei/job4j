package ru.job4j.oop.pojo;

import java.util.Objects;

/**
 * Class data model object type Product
 * @author Aleksei Usov
 */

public class Product {
    private String name;
    private int count;

    // Constructor object type Product
    public Product(String name, int count) {
        this.name = name;
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return count == product.count &&
                Objects.equals(name, product.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
