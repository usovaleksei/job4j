package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DeleteActionTest {

    @Test
    public void whenExecuteSuccess() {
        Output out = new StubOutput();
        Store tracker = new MemTracker();
        tracker.add(new Item("Item name"));
        DeleteItemAction del = new DeleteItemAction(out);

        Input input = mock(Input.class);

        when(input.askInt(any(String.class))).thenReturn(1);

        del.execute(input, tracker);

        String ln = System.lineSeparator();
        assertThat(out.toString(), is("=== Delete item ===" + ln + "Item delete successful" + ln));
        assertEquals(0, tracker.findAll().size());
    }

    @Test
    public void whenExecuteError() {
        Output out = new StubOutput();
        Store tracker = new MemTracker();
        tracker.add(new Item("Item name"));
        DeleteItemAction del = new DeleteItemAction(out);

        Input input = mock(Input.class);

        del.execute(input, tracker);

        String ln = System.lineSeparator();
        assertThat(out.toString(), is("=== Delete item ===" + ln + "Item not found" + ln));
        assertEquals(1, tracker.findAll().size());
    }
}
