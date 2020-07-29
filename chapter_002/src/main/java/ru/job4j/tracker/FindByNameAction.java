package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    private final Output out;

    public FindByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find item by name ===");
        String name = input.askStr("Enter item name: ");
        Item[] array = tracker.findByName(name);
        if (array.length > 0) {
            out.println("Items Was found");
            for (Item item : array) {
                out.println(item);
            }
        } else {
            out.println("Items Not found");
        }
        return true;
    }
}
