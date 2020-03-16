package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    //перегруженный метод для трех чисел
    public static int max(int first, int second, int third) {
        return max(third, max(first, second));
    }

    //перегруженный метод для четырех чисел
    public static int max(int first, int second, int third, int forth) {
        return max(forth, max(first, second, third));
    }
}