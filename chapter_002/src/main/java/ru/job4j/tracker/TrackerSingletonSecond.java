package ru.job4j.tracker;

/**
 * Implements Singletone with static field
 * @author Aleksei Usov
 */

public class TrackerSingletonSecond {

    private static TrackerSingletonSecond instance;

    private Tracker tracker;

    private TrackerSingletonSecond() {
        this.tracker = new Tracker();
    }

    public static TrackerSingletonSecond getInstance() {
        if (instance == null) {
            instance = new TrackerSingletonSecond();
        }
        return instance;
    }

    public Tracker getTracker() {
        return tracker;
    }
}
