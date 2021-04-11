package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MemTrackerSingletonFourthTest {
    @Test
    public void whenSingletonWithInnerClass() {
        MemTracker memTrackerOne = TrackerSingletonFourth.getInstance().getTracker();
        MemTracker memTrackerTwo = TrackerSingletonFourth.getInstance().getTracker();
        assertThat(memTrackerOne, is(memTrackerTwo));
    }
}