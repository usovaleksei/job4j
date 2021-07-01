package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Class tracker - items management
 * @author Aleksei Usov
 */

public class MemTracker implements Store {

    /**
     * collection for storing items
     */
    private List<Item> items = new ArrayList<>();

    /**
     * starting index
     */
    private int id = 1;

    /**
     * method adding a item to the storing
     *
     * @param item - new item
     */
    public Item add(Item item) {
        item.setId(this.id++);
        this.items.add(item);
        return item;
    }


    /**
     * method replace item with declared id
     *
     * @param id - item id
     */
    @Override
    public boolean replace(int id, Item item) {
        boolean result = false;
        int index = this.findIndex(id);
        if (index != - 1) {
            this.items.set(index, item);
            item.setId(id);
            result = true;
        }
        return result;
    }

    /**
     * method delete item with declared id
     *
     * @param id - item id
     */
    @Override
    public boolean delete(int id) {
        boolean done = false;
        int index = this.findIndex(id);
        if (index != - 1) {
            this.items.remove(index);
            done = true;
        }
        return done;
    }

    /**
     * method generate unique key to the item
     *
     * @return unique key
     */
    private int generateId() {
        Random rm = new Random();
        long rsl = (rm.nextInt() + System.currentTimeMillis());
        return (int) rsl;
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
     * @param key key for search
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
     * @param id item id
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
     * @param id - item id
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

    @Override
    public void init() {
    }

    @Override
    public void close() {
    }
}



