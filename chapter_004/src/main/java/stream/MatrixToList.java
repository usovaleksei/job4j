package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Class convert matrix to list
 * @author Aleksei Usov
 * @since 05/11/2020
 */

public class MatrixToList {

    /**
     * method convert matrix to list with stream
     * @param matrix multidimensional array Integer
     * @return list of numbers
     */

    public List<Integer> covertMatrixToList(Integer[][] matrix) {
        List<Integer> resultList = Stream.of(matrix)
                                         .flatMap(Arrays :: stream)
                                         .collect(Collectors.toList());
        return resultList;
    }
}
