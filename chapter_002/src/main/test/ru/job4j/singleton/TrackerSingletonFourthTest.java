package ru.job4j.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrackerSingletonFourthTest {
    @Test
    public void whenSingletonWithFinalClass() {
        TrackerSingletonFourth tracker1 = TrackerSingletonFourth.getTracker();
        TrackerSingletonFourth tracker2 = TrackerSingletonFourth.getTracker();
        assertEquals(tracker1, tracker2);
    }

}