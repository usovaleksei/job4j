package ru.job4j.tracker;

/**
 * Implements Singletone with inner class
 * @author Aleksei Usov
 */

public class TrackerSingletonFourth {

    private MemTracker memTracker;

    private TrackerSingletonFourth() {
        this.memTracker = new MemTracker();
    }

    public static TrackerSingletonFourth getInstance() {
        return Holder.INSTANCE;
    }

    private static final class Holder {
        private static final TrackerSingletonFourth INSTANCE = new TrackerSingletonFourth();
    }

    public MemTracker getTracker() {
        return memTracker;
    }
}
