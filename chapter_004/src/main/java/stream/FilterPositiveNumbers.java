package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class filter positive numbers from List
 * @author Aleksei Usov
 * @since 03/11/2020
 */

public class FilterPositiveNumbers {
    public static void main(String[] args) {

        //create number list
        List<Integer> numbers = Arrays.asList(1, 7, -3, 5, -15, 8);

        //create stream from list and filter positive numbers
        List<Integer> positiveNumbers =
                numbers.stream()
                       .filter(n -> n > 0)
                       .collect(Collectors.toList());

        System.out.println(positiveNumbers);
    }
}
