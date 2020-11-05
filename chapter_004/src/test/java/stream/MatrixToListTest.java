package stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixToListTest {

    @Test
    public void whenMatrixToList() {
        Integer[][] matrix = {{2, 3}, {3, 5}, {7, 9}};
        MatrixToList mtl = new MatrixToList();
        List<Integer> result = mtl.covertMatrixToList(matrix);
        List<Integer> expected = Arrays.asList(2, 3, 3, 5, 7, 9);
        assertThat(result, is(expected));
    }
}
