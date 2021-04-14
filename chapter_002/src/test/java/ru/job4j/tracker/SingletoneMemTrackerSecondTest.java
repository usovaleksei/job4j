package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class SingletoneMemTrackerSecondTest {

    @Test
    public void whenSingletonWithStaticField() {

        Tracker trackerOne = TrackerSingletonSecond.getInstance().getTracker();
        Tracker trackerTwo = TrackerSingletonSecond.getInstance().getTracker();
        assertThat(trackerOne, is(trackerTwo));
        assertNotNull(trackerOne);
    }
}