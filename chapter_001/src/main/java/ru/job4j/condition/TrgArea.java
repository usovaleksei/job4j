package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double pper = (a + b + c) / 2;
        return Math.sqrt(pper * (pper - a) * (pper - b) * (pper - c));
    }
    public static void main(String[] args) {
    double result = TrgArea.area(4, 3, 5);
    System.out.print("size a = 4, size b = 3, size c = 5, area = " + result);
    }
}
