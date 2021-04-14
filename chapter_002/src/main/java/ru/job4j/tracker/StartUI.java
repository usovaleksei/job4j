package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

/**
 * Class user interface for tracker Ver.6
 * @author Aleksei Usov
 * @since 29/09/2020
 */

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    /**
     * for select item of menu
     */
    public void init(Input input, Tracker tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            if (select < 0 || select > actions.size() - 1) {
                out.println("Wrong input, you can select: 0 .. " + (actions.size() - 1));
                continue;
            }
                UserAction action = actions.get(select);
                run = action.execute(input, tracker);
        }
    }

    /**
     * display menu items
     */
    public void showMenu(List<UserAction> actions) {
        out.println("Menu.");
        for (UserAction menuItem : actions) {
            out.println(actions.indexOf(menuItem) + ". " +menuItem.name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output, new ConsoleInput());
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new CreateAction(output));
        actions.add(new ShowAllAction(output));
        actions.add(new ReplaceAction(output));
        actions.add(new DeleteItemAction(output));
        actions.add(new FindByIdAction(output));
        actions.add(new FindByNameAction(output));
        actions.add(new ExitAction(output));
        new StartUI(output).init(input, tracker, actions);
    }
}
