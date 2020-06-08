package ru.job4j.io;

public class Matches {

    public static void main(String[] args) {
        Player player = new Player();
        int count = 0;
        String name = "";
        int matches = 11;

        while (matches > 0) {
            count++;
            name = isEven(count) ? "Aleksei" : "Roman";
            int userAnswer = player.getStep(name);
            matches -= userAnswer;
            System.out.println("Matches value on table: " + matches);
        }
        System.out.println("Победитель " + name);
    }

    private static boolean isEven(int value) {
        return value % 2 == 0;
    }
}







