package ru.job4j.tracker;

/**
 * Class user interface for tracker Ver.4
 * @author Aleksei Usov
 * @since 28/07/2020
 */

public class StartUI {

    /**
     * method for select item of menu
     */

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        //boolean isValid;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    /**
     * method display menu items
     */

    public void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
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
        UserAction[] actions = {
                new CreateAction()
        };
        new StartUI().init(input, tracker, actions);
    }
}

