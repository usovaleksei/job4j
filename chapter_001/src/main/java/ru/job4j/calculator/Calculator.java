package ru.job4j.calculator;

/**
 * Class  Класс для вычисления арифмитических операций "сложение", "вычитание", "умножение", "деление".
 * @author Aleksei Usov
 * @since 05.01.2020
 * @version 1.0
 */

public class Calculator {
    public static void add(double first, double second) {
        double result = first + second;
        System.out.println(first + " + " + second + " = " + result);
    }
    public static void div(double first, double second) {
        double result = first / second;
        System.out.println(first + " / " + second + " = " + result);
    }
    public static void multiply(double first, double second) {
        double result = first * second;
        System.out.println(first + " * " + second + " = " + result);
    }
    public static void subtrack(double first, double second) {
        double result = first - second;
        System.out.println(first + " - " + second + " = " + result);
    }

    /**
     * Main.
     * @param args - args.
     */

    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiply(50, 1.15);
        subtrack(10, 5);
    }
}

