package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ItemSortedTest {
    @Test
    public void whenSortedAscending() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("second item");
        Item item2 = new Item("first item");
        Item item3 = new Item("third item");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        List<Item> list = new ArrayList<>();
        Collections.addAll(list, item1, item2, item3);
        Collections.sort(list);
        List<Item> expected = new ArrayList<>();
        Collections.addAll(expected, item2, item1, item3);
        assertThat(list, is(expected));
    }

    @Test
    public void whenSortedDescending() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("2");
        Item item2 = new Item("1");
        Item item3 = new Item("3");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        List<Item> list = new ArrayList<>();
        Collections.addAll(list, item1, item2, item3);
        Collections.sort(list, new SortByNameItemComparator());
        List<Item> expected = new ArrayList<>();
        Collections.addAll(expected, item3, item1, item2);
        assertThat(list, is(expected));
    }
}
