package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class MemTrackerSingletonThirdTest {
    @Test
    public void whenSingletonWithStaticFinalField() {
        MemTracker memTrackerOne = TrackerSingletonThird.getInstance().getTracker();
        MemTracker memTrackerTwo = TrackerSingletonThird.getInstance().getTracker();
        assertThat(memTrackerOne, is(memTrackerTwo));
        assertNotNull(memTrackerOne);
    }
}