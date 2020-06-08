package ru.job4j.io;

import java.util.Scanner;

public class Player {

    private Scanner scanner = new Scanner(System.in);

    public int getStep(String playerName) {
        boolean isValid;
        int select;
        do {
            System.out.print("Player " + playerName + " enter value to 1 from 3: ");
            String answer = this.scanner.nextLine();
            select = Integer.parseInt(answer);
            isValid = validate(select);
            if (!isValid) {
                System.out.println("Enter correct value");
            }
        } while (!isValid);
        return select;
    }

    private boolean validate(int value) {
        return value >= 1 && value <= 3;
    }

}
