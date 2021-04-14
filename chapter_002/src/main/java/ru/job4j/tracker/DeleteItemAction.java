package ru.job4j.tracker;

public class DeleteItemAction implements UserAction {
    private final Output out;

    public DeleteItemAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Delete item ===");
        String id = input.askStr("Enter id item to delete ");
        if (tracker.deleteItem(id)) {
            out.println("Item delete successful");
        } else {
            out.println("Item not found");
        }
        return true;
    }
}


