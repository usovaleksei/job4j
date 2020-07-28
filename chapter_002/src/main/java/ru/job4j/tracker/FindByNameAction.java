package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find item by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter item name: ");
        Item[] array = tracker.findByName(name);
        if (array.length > 0) {
            System.out.println("Items Was found");
            for (Item item : array) {
                System.out.println(item);
            }
        } else {
            System.out.println("Items Not found");
        }
        return true;
    }
}
