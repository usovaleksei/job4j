package ru.job4j.singleton;

import ru.job4j.tracker.Item;

/**
 * Implements Singletone with static final class
 * @author Aleksei Usov
 */

public class TrackerSingletonFourth {

    private TrackerSingletonFourth() {
    }

    public static TrackerSingletonFourth getTracker() {
        return Holder.TRACKER;
    }

    public Item add(Item model) {
        return model;
    }

    private static final class Holder {
        private static final TrackerSingletonFourth TRACKER = new TrackerSingletonFourth();
    }
}
