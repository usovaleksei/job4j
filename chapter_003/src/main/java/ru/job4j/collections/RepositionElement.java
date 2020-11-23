package ru.job4j.collections;

import java.util.ArrayList;
import java.util.List;

public class RepositionElement {
        public static List<String> changePosition(List<String> list, int index) {
            if (index <= list.size() - 1) {
                String lastElement = list.remove(list.size() - 1);
                list.set(index, lastElement);
            }
            return list;
        }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");
        list.add("nine");
        System.out.println("List Before size: " + list.size());
        RepositionElement.changePosition(list, 3);
    }
}