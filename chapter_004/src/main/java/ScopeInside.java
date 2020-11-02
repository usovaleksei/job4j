import java.util.function.Supplier;

/**
 * Class for sum up numbers of array
 * @author Aleksei Usov
 * @since 02/11/2020
 */

public class ScopeInside {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            int finalTotal = total;
            total = add(
                    () -> finalTotal + num
            );
        }
        System.out.println(total);
    }

    private static Integer add(Supplier<Integer> calc) {
        return calc.get();
    }
}
