package ru.job4j.tracker;

/**
 * Implements Singletone with static final field
 * @author Aleksei Usov
 */

public class TrackerSingletonThird {

    private static final TrackerSingletonThird INSTANCE = new TrackerSingletonThird();

    private MemTracker memTracker;

    private TrackerSingletonThird() {
        this.memTracker = new MemTracker();
    }

    public static TrackerSingletonThird getInstance() {
        return INSTANCE;
    }

    public MemTracker getTracker() {
        return memTracker;
    }
/*private static final Tracker INSTANCE = new Tracker();

    private TrackerSingletonThird() {
    }

    public static Tracker getInstance() {
        return INSTANCE;
    }*/
}