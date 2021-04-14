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
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Edit item ===");
        String id = input.askStr("Enter id item to replace ");
        String itemName = input.askStr("Enter new item name ");
        if (tracker.replaceItem(id, new Item(itemName))) {
            out.println("Item replace successful");
        } else {
            out.println("Item not found");
        }
        return true;
    }
}
