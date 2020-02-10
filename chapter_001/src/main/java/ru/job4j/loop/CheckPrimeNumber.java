package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int finish) {
        boolean prime = false;
        int j = 0;
        for (int i = 2; i <= finish; i++) {
            if (finish % i == 0) {
            j++;
            }
        }
        if (j == 1) {
            prime = true;
        }
        return prime;
    }
}
