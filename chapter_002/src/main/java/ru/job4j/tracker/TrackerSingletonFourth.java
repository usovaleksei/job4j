package ru.job4j.tracker;

/**
 * Implements Singletone with inner class
 * @author Aleksei Usov
 */

public class TrackerSingletonFourth {

    private Tracker tracker;

    private TrackerSingletonFourth() {
        this.tracker = new Tracker();
    }

    public static TrackerSingletonFourth getInstance() {
        return Holder.INSTANCE;
    }

    private static final class Holder {
        private static final TrackerSingletonFourth INSTANCE = new TrackerSingletonFourth();
    }

    public Tracker getTracker() {
        return tracker;
    }
}
