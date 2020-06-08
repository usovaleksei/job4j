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
            if (item != null ) {
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

    public Item findByName(String key) {
        Item[] item = new Item[position];
        Item itemName = null;
        for (int index = 0; index < position; index++) {
            itemName = items[index];
            if (itemName != null && itemName.getName().equals(key)) {
                break;
            }
        }
        return itemName;
    }

    /**
     * method get item with declared id
     *
     * @param id
     */

    public Item findById(String id) {
        Item itemId = null;
        for (int index = 0; index < position; index++) {
            itemId = items[index];
            if (itemId != null && itemId.getId().equals(id)) {
                System.out.println("Name " + itemId.getName());
                break;
            } else {
                itemId = null;
            }
        }
        return itemId;
    }

    /**
     * method find index item with declared id
     *
     * @param item
     */

    public int findIndex(Item item) {
        int itemIndex = 0;
        for (int index = 0; index < position; index++) {
            Item tmpItem = items[index];
            if (tmpItem != null && tmpItem.getId().equals(item.getId()))
            itemIndex = index;
        }
        return itemIndex;
    }

    /**
     * method delete item with declared id
     *
     * @param id
     */

    public void deleteItem(String id) {
        Item item = findById(id);
        if (item != null) {
            int tmpIndex = findIndex(item);
            items[tmpIndex] = null;
            System.out.println("Item delete successful");
        } else {
            System.out.println("Item not found");
        }
    }

    /**
     * method replace item with declared id
     *
     * @param id
     */

    public void replaceItem(String id, String newItem) {
        boolean result = false;
        Item item = findById(id);
        if (item != null) {
            item.setName(newItem);
            System.out.println("Item replace successful");
            result = true;
        } else {
            System.out.println("Item not found");
        }
    }
}



