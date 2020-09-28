package ru.job4j.oop.tracker;

import org.junit.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {

    //test to adding new item to tracker
    @Test
    public void WhenAddNewItem () {
        Tracker tracker = new Tracker();
        Item item = new Item("first item");
        Item result = tracker.add(item);
        assertThat(result.getName(), is(item.getName()));
    }

    //test to display all items from storing
    @Test
    public void WhenAddNewItemThenFindAll() {
        Tracker tracker = new Tracker();
        Item item = new Item("first item");
        Item item1 = new Item(null);
        Item item2 = new Item("second item");
        tracker.add(item);
        tracker.add(item1);
        tracker.add(item2);
        List<Item> expected = new ArrayList<>();
        expected.add(item);
        expected.add(item1);
        expected.add(item2);
        List<Item> result = tracker.findAll();
        assertThat(result, is(expected));
    }

    //test to display all items according key
    @Test
    public void WhenAddNewItemThenFindByName() {
        Tracker tracker = new Tracker();
        Item item = new Item("first item");
        Item item2 = new Item("second item");
        Item item4 = new Item("first item");
        tracker.add(item);
        tracker.add(item2);
        tracker.add(item4);
        List<Item> expected = new ArrayList<>();
        expected.add(item);
        expected.add(item4);
        List<Item> result = tracker.findByName("first item");
        assertThat(result, is(expected));
    }

    //test to display all items according Id
    @Test
    public void WhenAddNewItemThenFindById() {
        Tracker tracker = new Tracker();
        Item item = new Item("first item");
        Item item1 = new Item("second item");
        tracker.add(item);
        tracker.add(item1);
        Item result = tracker.findById(item.getId());
        assertThat(result, is(item));
    }
}
