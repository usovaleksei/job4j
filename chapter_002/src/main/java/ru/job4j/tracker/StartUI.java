package ru.job4j.tracker;

/**
 * Class user interface for tracker Ver.5
 * @author Aleksei Usov
 * @since 29/07/2020
 */

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

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
                out.println("Enter correct value from 0 to 6");
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
        out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            out.println(index + ". " + actions[index].name());
        }
    }

    /**
     * validate menu value
     */
    private boolean validate(int value) {
        return value >= 0 && value <= 6;
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(output),
                new ShowAllAction(output),
                new ReplaceAction(output),
                new DeleteItemAction(output),
                new FindByIdAction(output),
                new FindByNameAction(output),
                new ExitAction(output)
        };
        new StartUI(output).init(input, tracker, actions);
    }
}
