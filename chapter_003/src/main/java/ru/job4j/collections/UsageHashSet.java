package ru.job4j.collections;

import java.util.HashSet;

/**
 * Class HashSet collection work
 * @author Aleksei Usov
 */

public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<>();
        autos.add("Lada");
        autos.add("BMV");
        autos.add("Volvo");
        autos.add("Toyota");
        for (String auto: autos) {
            System.out.println(auto);
        }
    }
}
