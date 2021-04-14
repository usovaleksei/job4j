package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MemTrackerSingletonFourthTest {
    @Test
    public void whenSingletonWithInnerClass() {
        Tracker trackerOne = TrackerSingletonFourth.getInstance().getTracker();
        Tracker trackerTwo = TrackerSingletonFourth.getInstance().getTracker();
        assertThat(trackerOne, is(trackerTwo));
    }
}