package ru.job4j.tracker;

/**
 * Implements Singletone with static field
 * @author Aleksei Usov
 */

public class TrackerSingletonSecond {

    private static TrackerSingletonSecond instance;

    private MemTracker memTracker;

    private TrackerSingletonSecond() {
        this.memTracker = new MemTracker();
    }

    public static TrackerSingletonSecond getInstance() {
        if (instance == null) {
            instance = new TrackerSingletonSecond();
        }
        return instance;
    }

    public MemTracker getTracker() {
        return memTracker;
    }
}
