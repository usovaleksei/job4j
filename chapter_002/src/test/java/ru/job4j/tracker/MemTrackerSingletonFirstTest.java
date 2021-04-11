package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MemTrackerSingletonFirstTest {

    @Test
    public void whenSingletonWithEnum() {

        MemTracker memTrackerSingltoneOne = TrackerSingletonFirst.INSTANCE.getTracker();
        MemTracker memTrackerSingltoneTwo = TrackerSingletonFirst.INSTANCE.getTracker();
        assertThat(memTrackerSingltoneOne, is(memTrackerSingltoneTwo));
    }
}
