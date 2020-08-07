package ru.job4j.singleton;

import ru.job4j.tracker.Item;

/**
 * Implements Singletone with Enum
 * @author Aleksei Usov
 */

public enum TrackerSingletonFirst {
    TRACKER;

    public Item add(Item model) {
        return model;
    }
}
