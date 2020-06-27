package ru.job4j.tracker;

/**
 * Class user interface for tracker Ver.3
 * @author Aleksei Usov
 * @since 27/06/2020
 */

public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void showAllItems(Input input, Tracker tracker) {
        System.out.println("=== Show all tracker items ===");
        Item[] array = tracker.findAll();
        for (Item item : array) {
            System.out.println(item);
        }
    }

    public static void replaceItem(Input input, Tracker tracker){
        System.out.println("=== Replace Item ===");
        String id = input.askStr("Enter id item to replace ");
        String itemName = input.askStr("Enter new item name ");
        if (tracker.replaceItem(id, new Item(itemName))) {
            System.out.println("Item replace successful");
        } else {
            System.out.println("Item not found");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ===");
        String id = input.askStr("Enter id item to delete ");
        if (tracker.deleteItem(id)) {
            System.out.println("Item delete successful");
        } else {
            System.out.println("Item not found");
        }
    }

    public static void findById(Input input, Tracker tracker) {
        System.out.println("=== Find item by ID ===");
        String id = input.askStr("Enter item ID: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("Item Was found");
            System.out.println(item);
        } else {
            System.out.println("Item Not found");
        }
    }

    public static void findByName(Input input, Tracker tracker) {
        System.out.println("=== Find item by name ===");
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
    }

    /**
     * method for select item of menu
     */

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        boolean isValid;
        while (run) {
            this.showMenu();
            do {
                int select = input.askInt("Select: ");
                isValid = validate(select);
                if (!isValid) {
                    System.out.println("Enter correct value from 0 to 6");
                    continue;
                }
                if (select == 0) {
                    StartUI.createItem(input, tracker);
                } else if (select == 1) {
                    StartUI.showAllItems(input, tracker);
                } else if (select == 2) {
                    StartUI.replaceItem(input, tracker);
                } else if (select == 3) {
                    StartUI.deleteItem(input, tracker);
                } else if (select == 4) {
                    StartUI.findById(input, tracker);
                } else if (select == 5) {
                    StartUI.findByName(input, tracker);
                } else if (select == 6) {
                    run = false;
                }
            } while (!isValid);
        }
    }

    /**
     * method display menu items
     */

    public void showMenu() {
        System.out.println("Menu:");
        System.out.println("0. Add new item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by ID");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit program");
    }

    /**
     * method validate menu value
     */

    private boolean validate(int value) {
        return value >= 0 && value <= 6;
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}

