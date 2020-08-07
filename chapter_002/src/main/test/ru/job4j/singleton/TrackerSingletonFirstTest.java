package ru.job4j.singleton;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;

public class TrackerSingletonFirstTest {

    @Test
    public void whenSingletonWithEnum () {
        TrackerSingletonFirst tracker1 = TrackerSingletonFirst.TRACKER;
        TrackerSingletonFirst tracker2 = TrackerSingletonFirst.TRACKER;
        assertEquals(tracker1, is(tracker2));
    }
}