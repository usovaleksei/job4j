package ru.job4j.tracker;

/**
 * Implements Singletone with enum
 * @author Aleksei Usov
 */

public enum TrackerSingletonFirst {

    INSTANCE;

    private MemTracker memTracker;

    private TrackerSingletonFirst() {
        this.memTracker = new MemTracker();
    }

    public MemTracker getTracker() {
        return memTracker;
    }
}
