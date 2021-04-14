package ru.job4j.tracker;

/**
 * Implements Singletone with enum
 * @author Aleksei Usov
 */

public enum TrackerSingletonFirst {

    INSTANCE;

    private Tracker tracker;

    private TrackerSingletonFirst() {
        this.tracker = new Tracker();
    }

    public Tracker getTracker() {
        return tracker;
    }
}
