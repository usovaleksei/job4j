package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {
    //тест на проверку одномерного массива из трех элементов
    @Test
    public void whenBound3Then149() {
        int bound = 3;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[] {1, 4, 9};
        assertThat (rst, is(expect));
    }

    //тест на проверку одномерного массива из пяти элементов
    @Test
    public void whenBound5Then1491625() {
        int bound = 5;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[] {1, 4, 9, 16, 25};
        assertThat (rst, is(expect));
    }

    //тест на проверку одномерного массива из восьми элементов
    @Test
    public void whenBound5Then1491625364964() {
        int bound = 8;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[] {1, 4, 9, 16, 25, 36, 49, 64};
        assertThat (rst, is(expect));
    }
}
