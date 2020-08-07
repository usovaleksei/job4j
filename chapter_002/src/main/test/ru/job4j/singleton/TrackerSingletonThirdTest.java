package ru.job4j.singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrackerSingletonThirdTest {
    @Test
    public void whenSingletonWitStaticFinalField() {
        TrackerSingletonThird tracker1 = TrackerSingletonThird.getTracker();
        TrackerSingletonThird tracker2 = TrackerSingletonThird.getTracker();
        assertEquals(tracker1, tracker2);
    }

}