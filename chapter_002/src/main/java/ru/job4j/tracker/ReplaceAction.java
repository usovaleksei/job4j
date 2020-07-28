package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "=== Edit item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id item to replace ");
        String itemName = input.askStr("Enter new item name ");
        if (tracker.replaceItem(id, new Item(itemName))) {
            System.out.println("Item replace successful");
        } else {
            System.out.println("Item not found");
        }
        return true;
    }
}
