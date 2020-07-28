package ru.job4j.tracker;

public class DeleteItemAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id item to delete ");
        if (tracker.deleteItem(id)) {
            System.out.println("Item delete successful");
        } else {
            System.out.println("Item not found");
        }
        return true;
    }
}


