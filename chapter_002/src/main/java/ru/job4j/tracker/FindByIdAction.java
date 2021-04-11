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
    public boolean execute(Input input, Store memTracker) {
        out.println("=== Find item by ID ===");
        int id = input.askInt("Enter item ID: ");
        Item item = memTracker.findById(id);
        if (item != null) {
            out.println("Item Was found");
            out.println(item);
        } else {
            out.println("Item Not found");
        }
        return true;
    }
}
