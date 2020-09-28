package ru.job4j.tracker;

import java.util.List;

public class FindByNameAction implements UserAction {
    private final Output out;

    public FindByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find item by name ===");
        String name = input.askStr("Enter item name: ");
        List<Item> list = tracker.findByName(name);
        if (list.size() > 0) {
            out.println("Items Was found");
            for (Item item : list) {
                out.println(item);
            }
        } else {
            out.println("Items Not found");
        }
        return true;
    }
}
