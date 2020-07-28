package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

/**
 * Class user interface for tracker Ver.4
 * @author Aleksei Usov
 * @since 28/07/2020
 */

public class StartUI {

    /**
     * for select item of menu
     */
    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        boolean isValid;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            isValid = validate(select);
            if (!isValid) {
                System.out.println("Enter correct value from 0 to 6");
                continue;
            }
                UserAction action = actions[select];
                run = action.execute(input, tracker);
        }
    }

    /**
     * display menu items
     */
    public void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    /**
     * validate menu value
     */
    private boolean validate(int value) {
        return value >= 0 && value <= 6;
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new ShowAllAction(),
                new ReplaceAction(),
                new DeleteItemAction(),
                new FindByIdAction(),
                new FindByNameAction(),
                new ExitAction()
        };
        new StartUI().init(input, tracker, actions);
        List<String> list = new ArrayList<>();
    }
}
