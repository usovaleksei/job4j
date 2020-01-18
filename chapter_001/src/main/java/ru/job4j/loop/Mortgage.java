package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double bal = amount;
        while (bal > 0) {
            year++;
            bal = bal + bal * (percent / 100) - salary;
            }
        return year;
    }
}
