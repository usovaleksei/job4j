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
    public boolean execute(Input input, Store memTracker) {
        out.println("=== Delete item ===");
        int id = input.askInt("Enter id item to delete ");
        if (memTracker.delete(id)) {
            out.println("Item delete successful");
        } else {
            out.println("Item not found");
        }
        return true;
    }
}


