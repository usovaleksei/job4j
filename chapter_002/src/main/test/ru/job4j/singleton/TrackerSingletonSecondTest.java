package ru.job4j.singleton;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;

public class TrackerSingletonSecondTest {
    @Test
    public void whenSingletonWithStaticField() {
        TrackerSingletonSecond tracker1 = TrackerSingletonSecond.getTracker();
        TrackerSingletonSecond tracker2 = TrackerSingletonSecond.getTracker();
        assertEquals(tracker1, is(tracker2));
    }
}