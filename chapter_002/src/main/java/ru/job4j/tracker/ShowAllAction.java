package ru.job4j.tracker;

import java.util.List;

public class ShowAllAction implements UserAction {
    private final Output out;

    public ShowAllAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show all";
    }

    @Override
    public boolean execute(Input input, Store memTracker) {
        out.println("=== Show all tracker items ===");
        List<Item> list = memTracker.findAll();
        for (Item item : list) {
            out.println(item);
        }
        return true;
    }
}
