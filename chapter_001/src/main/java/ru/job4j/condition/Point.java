package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * Class  Класс для вычисления расстояния между точками в двухмерном и трехмерном пространстве.
 * @author Aleksei Usov
 * @since 26.03.2020
 * @version 2.0
 */

public class Point {
    private int x;

    private int y;

    private int z;

    /**
     * Конструктор, который задает начальное состояние объекта точка в двух координатах
     * @param first координата x
     * @param second координата y
     */

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /**
     * Конструктор, который задает начальное состояние объекта точка в трех координатах
     * @param first координата x
     * @param second координата y
     * @param third координата z
     */

    public Point(int first, int second, int third) {
        this.x = first;
        this.y = second;
        this.z = third;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));

    }
}
