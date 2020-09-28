package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Class tracker - items management
 * @author Aleksei Usov
 */

public class Tracker {

    /**
     * collection for storing items
     */
    private List<Item> items = new ArrayList<>();

    /**
     * method adding a item to the storing
     *
     * @param item - new item
     */
    public Item add(Item item) {
        item.setId(generateId());
        this.items.add(item);
        return item;
    }

    /**
     * method generate unique key to the item
     *
     * @return unique key
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    /**
     * method get all items from storing
     *
     * @return array of all items without null
     */
    public List<Item> findAll() {
        return this.items;
    }

    /**
     * method get items with declared key
     *
     * @param key
     * @return items with declared key
     */

    public List<Item> findByName(String key) {
        List<Item> findItems = new ArrayList<>();
        for (Item item : this.items) {
            if (item.getName().equals(key))
                findItems.add(item);
        }
        return findItems;
    }

    /**
     * method get item with declared id
     *
     * @param id
     */

    public Item findById(String id) {
        Item findIdItem = null;
        for (Item item : this.items) {
            if (item.getId().equals(id)) {
                findIdItem = item;
                break;
            }
        }
        return findIdItem;
    }

    /**
     * method delete item with declared id
     *
     * @param id
     */

    public boolean deleteItem(String id) {
        boolean done = false;
        Item item = this.findById(id);
        if (item != null) {
            this.items.remove(item);
            done = true;
        }
        return done;
    }

    /**
     * method replace item with declared id
     *
     * @param id
     */

    public boolean replaceItem(String id, Item newItem) {
        boolean result = false;
        Item item = this.findById(id);
        if (item != null) {
            this.items.set(this.items.indexOf(item), newItem);
            newItem.setId(id);
            result = true;
        }
        return result;
    }
}



