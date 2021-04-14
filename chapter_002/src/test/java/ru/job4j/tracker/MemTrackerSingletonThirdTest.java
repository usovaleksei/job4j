package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class MemTrackerSingletonThirdTest {
    @Test
    public void whenSingletonWithStaticFinalField() {
        Tracker trackerOne = TrackerSingletonThird.getInstance().getTracker();
        Tracker trackerTwo = TrackerSingletonThird.getInstance().getTracker();
        assertThat(trackerOne, is(trackerTwo));
        assertNotNull(trackerOne);
    }
}