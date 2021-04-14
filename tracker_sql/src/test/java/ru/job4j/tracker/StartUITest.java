package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.tracker.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

public class StartUITest {

    /*@Test
    public void whenReplaceItem() {
        Output out = new StubOutput();
        Store tracker = new SqlTracker();
        Item item = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[] {"0", String.valueOf(item.getId()), replacedName, "1"}
        );
        List<UserAction> actions = new ArrayList<>();
        actions.add(new ReplaceAction(out));
        actions.add(new ExitAction(out));
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenCreateItem() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "Item name", "1"}
        );
        Store tracker = new SqlTracker();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new CreateAction(out));
        actions.add(new ExitAction(out));
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll().get(0).getName(), is("Item name"));
    }
    @Test
    public void whenDeleteItem() {
        Output out = new StubOutput();
        Store tracker = new SqlTracker();
        Item item = tracker.add(new Item("Deleted item"));
        Input in = new StubInput(
                new String[] {"0", String.valueOf(item.getId()), "1"}
        );
        List<UserAction> actions = new ArrayList<>();
        actions.add(new DeleteItemAction(out));
        actions.add(new ExitAction(out));
        new StartUI(out).init(in, tracker,actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0"}
        );
        Store tracker = new SqlTracker();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new ExitAction(out));
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindAll() {
        Output out = new StubOutput();
        Store tracker = new SqlTracker();
        Item item1 = tracker.add(new Item("Item name one"));
        Item item2 = tracker.add(new Item("Item name two"));
        Input in = new StubInput(
                new String[]{"0", "1"}
        );
        List<UserAction> actions = new ArrayList<>();
        actions.add(new ShowAllAction(out));
        actions.add(new ExitAction(out));
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Show all" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator() +
                        "=== Show all tracker items ===" + System.lineSeparator() +
                        "item Id: " + item1.getId() + ", item Name: " + item1.getName() + System.lineSeparator() +
                        "item Id: " + item2.getId() + ", item Name: " + item2.getName() + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. Show all" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindByID() {
        Output out = new StubOutput();
        Store tracker = new SqlTracker();
        Item item = tracker.add(new Item("Item name one"));
        Input in = new StubInput(
                new String[]{"0", String.valueOf(item.getId()), "1"}
        );
        List<UserAction> actions = new ArrayList<>();
        actions.add(new FindByIdAction(out));
        actions.add(new ExitAction(out));
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Find by ID" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator() +
                        "=== Find item by ID ===" + System.lineSeparator() +
                        "Item Was found" + System.lineSeparator() +
                        "item Id: " + item.getId() + ", item Name: " + item.getName() + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. Find by ID" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindByName() {
        Output out = new StubOutput();
        Store tracker = new SqlTracker();
        Item item = tracker.add(new Item("Item name one"));
        Input in = new StubInput(
                new String[]{"0", item.getName(), "1"}
        );
        List<UserAction> actions = new ArrayList<>();
        actions.add(new FindByNameAction(out));
        actions.add(new ExitAction(out));
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Find by name" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator() +
                        "=== Find item by name ===" + System.lineSeparator() +
                        "Items Was found" + System.lineSeparator() +
                        "item Id: " + item.getId() + ", item Name: " + item.getName() + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. Find by name" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator()
        ));
    }

    //test to adding new item to tracker
    @Test
    public void WhenAddNewItem () {
        Store tracker = new SqlTracker();
        Item item = new Item("first item");
        Item result = tracker.add(item);
        assertThat(result.getName(), is(item.getName()));
    }

    //test to display all items from storing
    @Test
    public void WhenAddNewItemThenFindAll() {
        Store tracker = new SqlTracker();
        Item item = new Item("first item");
        Item item1 = new Item(null);
        Item item2 = new Item("second item");
        tracker.add(item);
        tracker.add(item1);
        tracker.add(item2);
        List<Item> expected = new ArrayList<>();
        Collections.addAll(expected, item, item1, item2);
        List<Item> result = tracker.findAll();
        assertThat(result, is(expected));
    }

    //test to display all items according key
    @Test
    public void WhenAddNewItemThenFindByName() {
        Store tracker = new SqlTracker();
        Item item = new Item("first item");
        Item item2 = new Item("second item");
        Item item4 = new Item("first item");
        tracker.add(item);
        tracker.add(item2);
        tracker.add(item4);
        List<Item> expected = new ArrayList<>();
        Collections.addAll(expected, item, item4);
        List<Item> result = tracker.findByName("first item");
        assertThat(result, is(expected));
    }

    //test to display all items according Id
    @Test
    public void WhenAddNewItemThenFindById() {
        Store tracker = new SqlTracker();
        Item item = new Item("first item");
        Item item1 = new Item("second item");
        tracker.add(item);
        tracker.add(item1);
        Item result = tracker.findById(item.getId());
        assertThat(result, is(item));
    }*/
}
