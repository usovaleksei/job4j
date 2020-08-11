package ru.job4j.tracker;

/**
 * Implements Singletone with static final field
 * @author Aleksei Usov
 */

public class TrackerSingletonThird {

    private static final TrackerSingletonThird INSTANCE = new TrackerSingletonThird();

    private Tracker tracker;

    private TrackerSingletonThird() {
        this.tracker = new Tracker();
    }

    public static TrackerSingletonThird getInstance() {
        return INSTANCE;
    }

    public Tracker getTracker() {
        return tracker;
    }
/*private static final Tracker INSTANCE = new Tracker();

    private TrackerSingletonThird() {
    }

    public static Tracker getInstance() {
        return INSTANCE;
    }*/
}