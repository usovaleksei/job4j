package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * Class tracker - items management
 * @author Aleksei Usov
 */

public class Tracker {

    /**
     * array for storing items
     */
    private final Item[] items = new Item[100];


    /**
     * cell pointer for a new item
     */
    int position = 0;


    /**
     * method adding a item to the storing
     *
     * @param item - new item
     */
    public Item add(Item item) {
        item.setId(generateId());
        this.items[position++] = item;
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
    public Item[] findAll() {
        return Arrays.copyOf(items, position);
    }

    /**
     * method get items with declared key
     *
     * @param key
     * @return items with declared key
     */

    public Item[] findByName(String key) {
        int size = 0;
        Item[] itemFind = new Item[position];
        for (int index = 0; index < itemFind.length; index++) {
            Item item = items[index];
            if (item != null && item.getName().equals(key)) {
                itemFind[size] = item;
                size++;
            }
        }
        itemFind = Arrays.copyOf(itemFind, size);
        return itemFind;
    }


    /**
     * method get item with declared id
     *
     * @param id
     */

    public Item findById(String id) {
        Item item = null;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                item = items[index];
                break;
            }
        }
        return item;
    }

    /**
     * method find index item with declared id
     *
     * @param id
     */

    private int findIndex(String id) {
        int itemIndex = -1;
        for (int index = 0; index < position; index++) {
            Item tmpItem = items[index];
            if (tmpItem != null && tmpItem.getId().equals(id)) {
                itemIndex = index;
                break;
            }
        }
        return itemIndex;
    }

    /**
     * method delete item with declared id
     *
     * @param id
     */

    public boolean deleteItem(String id) {
        boolean done = false;
            int tmpIndex = findIndex(id);
            if (tmpIndex != - 1) {
            items[tmpIndex] = null;
            System.arraycopy(items, tmpIndex + 1, items, tmpIndex, position - 1);
            position--;
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
        for (int i = 0; i < position; i++) {
            if (items[i].getId().equals(id)) {
                items[i] = newItem;
                items[i].setId(id);
                result = true;
                break;
            }
        }
        return result;
    }
}



