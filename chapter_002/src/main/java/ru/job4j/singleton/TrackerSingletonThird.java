package ru.job4j.singleton;

import ru.job4j.tracker.Item;

/**
 * Implements Singletone with static final field
 * @author Aleksei Usov
 */

public class TrackerSingletonThird {
    private static final TrackerSingletonThird tracker = new TrackerSingletonThird();

    private TrackerSingletonThird() {
    }

    public static TrackerSingletonThird getTracker() {
        return tracker;
    }

    public Item add(Item model) {
        return model;
    }
}

