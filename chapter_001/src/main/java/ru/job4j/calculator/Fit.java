package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height) {
        return (height - 100) * 1.15;
    }
    public static double womanWeight(double height) {
        return (height - 110) * 1.15;
        }
    public static void main(String[] args) {
        double man = manWeight(170);
        System.out.println("Man 170 is " + man + " kg");
        man = manWeight(180);
        System.out.println("Man 180 is " + man + " kg");
        man = manWeight(155);
        System.out.println("Man 150 is " + man + " kg");
        double woman = womanWeight(165);
        System.out.println("Woman 165 is " + woman + " kg");
        woman = womanWeight(170);
        System.out.println("Woman 170 is " + woman + " kg");
    }
}

