package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MemTrackerSingletonFirstTest {

    @Test
    public void whenSingletonWithEnum() {

        Tracker trackerSingltoneOne = TrackerSingletonFirst.INSTANCE.getTracker();
        Tracker trackerSingltoneTwo = TrackerSingletonFirst.INSTANCE.getTracker();
        assertThat(trackerSingltoneOne, is(trackerSingltoneTwo));
    }
}
