package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FindByIdActionTest {

    @Test
    public void whenExecuteSuccess() {
        Output out = new StubOutput();
        Store tracker = new MemTracker();
        Item item = new Item("Item name");
        tracker.add(item);
        FindByIdAction find = new FindByIdAction(out);

        Input input = mock(Input.class);

        when(input.askInt(any(String.class))).thenReturn(1);

        find.execute(input, tracker);

        String ln = System.lineSeparator();
        assertThat(out.toString(), is("=== Find item by ID ===" + ln + "Item Was found" + ln + item + ln));
        assertThat(tracker.findAll().get(0).getName(), is(item.getName()));
    }

    @Test
    public void whenExecuteError() {
        Output out = new StubOutput();
        Store tracker = new MemTracker();
        Item item = new Item("Item name");
        tracker.add(item);
        FindByIdAction find = new FindByIdAction(out);

        Input input = mock(Input.class);

        find.execute(input, tracker);

        String ln = System.lineSeparator();
        assertThat(out.toString(), is("=== Find item by ID ===" + ln + "Item Not found" + ln));
    }
}
