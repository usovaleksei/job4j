package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Edit";
    }

    @Override
    public boolean execute(Input input, Store memTracker) {
        out.println("=== Edit item ===");
        int id = input.askInt("Enter id item to replace ");
        String itemName = input.askStr("Enter new item name ");
        if (memTracker.replace(id, new Item(itemName))) {
            out.println("Item replace successful");
        } else {
            out.println("Item not found");
        }
        return true;
    }
}
