package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double height = p/(2 * (k + 1));
        double length = height * k;
        return height * length;
    }
    public static void main(String[] args) {
        double result1 = square(6, 2);
        System.out.println("p = 6, k = 2, real = " + result1);
    }
}
