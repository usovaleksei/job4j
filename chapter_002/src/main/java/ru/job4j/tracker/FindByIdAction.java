package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    private final Output out;

    public FindByIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find by ID";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find item by ID ===");
        String id = input.askStr("Enter item ID: ");
        Item item = tracker.findById(id);
        if (item != null) {
            out.println("Item Was found");
            out.println(item);
        } else {
            out.println("Item Not found");
        }
        return true;
    }
}
