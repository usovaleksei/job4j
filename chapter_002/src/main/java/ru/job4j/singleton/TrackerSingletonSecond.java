package ru.job4j.singleton;

import ru.job4j.tracker.Item;

/**
 * Implements Singletone with static field
 * @author Aleksei Usov
 */

public class TrackerSingletonSecond {
    private static TrackerSingletonSecond tracker;

    private TrackerSingletonSecond() {
    }

    public static TrackerSingletonSecond getTracker() {
        if (tracker == null) {
            tracker = new TrackerSingletonSecond();
        }
        return tracker;
    }

    public Item add(Item model) {
        return model;
    }
}
