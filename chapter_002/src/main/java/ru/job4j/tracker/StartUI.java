package ru.job4j.tracker;

import java.util.Scanner;

/**
 * Class user interface for tracker
 * @author Aleksei Usov
 * @since 02/06/2020
 */

public class StartUI {

    /**
     * method for select item of menu
     */

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        boolean isValid;
        while (run) {
            this.showMenu();
            do {
                System.out.print("Select: ");
                int select = Integer.valueOf(scanner.nextLine());
                isValid = validate(select);
                if (!isValid) {
                    System.out.println("Enter correct value from 0 to 6");
                }
                if (select == 0) {
                    System.out.println("=== Create a new item ===");
                    System.out.print("Enter name of new item: ");
                    String name = scanner.nextLine();
                    Item item = new Item(name);
                    tracker.add(item);
                } else if (select == 1) {
                    System.out.println("=== Show all tracker items ===");
                    Item[] list = tracker.findAll();
                    for (int i = 0; i < list.length; i++) {
                        System.out.println("id: " + list[i].getId() + " " + list[i].getName());
                    }
                } else if (select == 2) {
                    System.out.println("=== Replace item ===");
                    System.out.print("Enter id item to replace ");
                    String id = scanner.nextLine();
                    if (tracker.findById(id) != null) {
                        System.out.print("Enter new item name ");
                        String itemName = scanner.nextLine();
                        tracker.replaceItem(id, itemName);
                    } else {
                        System.out.println("Item Not found");
                    }
                } else if (select == 3) {
                    System.out.println("=== Delete item ===");
                    System.out.print("Enter id item to delete ");
                    String id = scanner.nextLine();
                    tracker.deleteItem(id);

                } else if (select == 4) {
                    System.out.println("=== Find item by ID ===");
                    System.out.print("Enter item ID: ");
                    String id = scanner.nextLine();
                    if (tracker.findById(id) != null) {
                        System.out.println("Item Was found");
                    } else {
                        System.out.println("Item Not found");
                    }
                } else if (select == 5) {
                    System.out.println("=== Find item by name ===");
                    System.out.print("Enter item name: ");
                    String name = scanner.nextLine();
                    System.out.println("Item Id: " + tracker.findByName(name).getId());
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
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}

