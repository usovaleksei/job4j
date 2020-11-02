import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Class link to method with lambda
 * @author Aleksei Usov
 * @since 02/11/2020
 */

public class RefMethod {

    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Ivan",
                "Petr Arsentev"
        );

        Consumer<String> out = RefMethod::cutOut;
        names.forEach(out);
    }

    /**
     * method cut length name more than 10 symbols
     * @param value - name
     */

    public static void cutOut(String value) {
        if (value.length() > 10) {
            System.out.println(value.substring(0, 10) + "..");
        } else {
            System.out.println(value);
        }
    }
}
