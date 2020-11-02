package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Class calculate function in range
 * @author Aleksei Usov
 * @since 02/11/2020
 */

public class FunctionRange {
    public static List<Double> diapason(int start, int end, Function<Double, Double> function){
        List<Double> result = new ArrayList<>();
        for (double i = start; i < end; i++) {
            result.add(function.apply(i));
        }
        return result;
    }
}
