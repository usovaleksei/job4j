package ru.job4j.tracker;

public class ShowAllAction implements UserAction {
    private final Output out;

    public ShowAllAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show all";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Show all tracker items ===");
        Item[] array = tracker.findAll();
        for (Item item : array) {
            out.println(item);
        }
        return true;
    }
}
