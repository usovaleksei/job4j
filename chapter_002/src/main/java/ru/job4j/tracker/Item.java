package ru.job4j.tracker;

/**
 * Class data model tracker item
 * @author Aleksei Usov
 * @since 30/09/2020
 */

public class Item implements Comparable<Item>{
    private String id;
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    /**
     * Method sorted items to ascending
     * @param another item
     */

    @Override
    public int compareTo(Item another) {
        return this.name.compareTo(another.name);
    }
}
