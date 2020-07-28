package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "=== Find item by ID ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter item ID: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("Item Was found");
            System.out.println(item);
        } else {
            System.out.println("Item Not found");
        }
        return true;
    }
}
