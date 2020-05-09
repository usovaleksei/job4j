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
        int size = 0;
        Item[] itemsWithoutNull = new Item[position];
        for (int index = 0; index < position; index++) {
            Item item = items[index];
            if (item.getId() != null && item.getName() != null) {
                itemsWithoutNull[size] = item;
                size++;
            }
        }
        itemsWithoutNull = Arrays.copyOf(itemsWithoutNull, size);
        return itemsWithoutNull;
    }

    /**
     * method get items with declared key
     *
     * @param key
     * @return items with declared key
     */

    public Item[] findByName(String key) {
        int size = 0;
        Item[] namesWithoutNull = new Item[position];
        for (int index = 0; index < position; index++) {
            Item item = items[index];
            if (item.getName() != null && item.getName().equals(key)) {
                namesWithoutNull[size] = item;
                size++;
            }
        }
        namesWithoutNull = Arrays.copyOf(namesWithoutNull, size);
        return namesWithoutNull;
    }

    /**
     * method get item with declared id
     *
     * @param id
     */

    public Item findById(String id) {
        Item[] item = new Item[position];
        Item itemId = null;
        for (int index = 0; index < position; index++) {
            itemId = items[index];
            if (itemId.getId() != null && itemId.getId().equals(id)) {
                break;
            }
        }
        return itemId;
    }
}
