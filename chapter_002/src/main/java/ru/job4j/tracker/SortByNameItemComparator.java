package ru.job4j.tracker;

import java.util.Comparator;

/**
 * Class comparator for sorted items to descending
 * @author Aleksei Usov
 * @since 30/09/2020
 */

public class SortByNameItemComparator implements Comparator<Item> {

    /**
     * Method sorted items to descending
     * @param first item
     * @param second item
     */

    @Override
    public int compare(Item first, Item second) {
        return second.getName().compareTo(first.getName());
    }
}
