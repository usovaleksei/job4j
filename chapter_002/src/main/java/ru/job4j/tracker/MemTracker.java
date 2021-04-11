package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Class tracker - items management
 * @author Aleksei Usov
 */

public class MemTracker {

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
    private int generateId() {
        Random rm = new Random();
        Long rsl = (rm.nextInt() + System.currentTimeMillis());
        return rsl.intValue();
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
     * @return item with declared id
     */

    public Item findById(int id) {
        Item findIdItem = null;
        for (Item item : this.items) {
            if (item.getId() == id) {
                findIdItem = item;
                break;
            }
        }
        return findIdItem;
    }

    /**
     * method for search item index with declared id
     *
     * @param id
     * @return item index with declared id
     */

    public int findIndex(int id) {
        int findIndexItem = - 1;
        for (int index = 0; index < items.size(); index++ ) {
            if (items.get(index).getId() == id) {
                findIndexItem = index;
                break;
            }
        }
        return findIndexItem;
    }

    /**
     * method delete item with declared id
     *
     * @param id
     */

    public boolean deleteItem(int id) {
        boolean done = false;
        int index = this.findIndex(id);
        if (index != - 1) {
            this.items.remove(index);
            done = true;
        }
        return done;
    }

    /**
     * method replace item with declared id
     *
     * @param id
     */

    public boolean replaceItem(int id, Item newItem) {
        boolean result = false;
        int index = this.findIndex(id);
        if (index != - 1) {
            this.items.set(index, newItem);
            newItem.setId(id);
            result = true;
        }
        return result;
    }
}



