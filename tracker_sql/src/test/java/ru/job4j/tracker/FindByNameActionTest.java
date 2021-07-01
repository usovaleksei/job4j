package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FindByNameActionTest {

    @Test
    public void whenExecuteSuccess() {
        Output out = new StubOutput();
        Store tracker = new MemTracker();
        String itemName = "Item name";
        Item item = new Item(itemName);
        tracker.add(item);
        FindByNameAction find = new FindByNameAction(out);

        Input input = mock(Input.class);

        when(input.askStr(any(String.class))).thenReturn(itemName);

        find.execute(input, tracker);

        String ln = System.lineSeparator();
        assertThat(out.toString(), is("=== Find item by name ===" + ln + "Items Was found" + ln + item + ln));
        assertThat(tracker.findAll().get(0).getName(), is(itemName));
    }

    @Test
    public void whenExecuteError() {
        Output out = new StubOutput();
        Store tracker = new MemTracker();
        String itemName = "Item name";
        Item item = new Item(itemName);
        tracker.add(item);
        FindByNameAction find = new FindByNameAction(out);

        Input input = mock(Input.class);

        find.execute(input, tracker);

        String ln = System.lineSeparator();
        assertThat(out.toString(), is("=== Find item by name ===" + ln + "Items Not found" + ln));
    }
}
