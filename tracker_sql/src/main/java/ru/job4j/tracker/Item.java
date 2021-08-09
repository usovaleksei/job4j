package ru.job4j.tracker;

import javax.persistence.*;
import java.util.Objects;

/**
 * Class data model tracker item
 * @author Aleksei Usov
 * @since 30/09/2020
 */

@Entity
@Table(name = "items")
public class Item implements Comparable<Item>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    public Item() {
    }

    public Item(String name) {
        this.name = name;
    }

    public Item(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public Item(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "item Id: " + id +
                ", item Name: " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id &&
                Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    /**
     * Method sorted items to ascending
     * @param another item
     */

    @Override
    public int compareTo(Item another) {
        return this.name.compareTo(another.name);
    }
}
