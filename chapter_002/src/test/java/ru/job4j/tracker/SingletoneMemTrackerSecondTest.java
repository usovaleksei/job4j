package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class SingletoneMemTrackerSecondTest {

    @Test
    public void whenSingletonWithStaticField() {

        MemTracker memTrackerOne = TrackerSingletonSecond.getInstance().getTracker();
        MemTracker memTrackerTwo = TrackerSingletonSecond.getInstance().getTracker();
        assertThat(memTrackerOne, is(memTrackerTwo));
        assertNotNull(memTrackerOne);
    }
}