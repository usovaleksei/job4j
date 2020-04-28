package ru.job4j.oop.pojo;

public class ProductContains {
    public static void main(String[] args) {
        Product first = new Product("milk", 100);
        Product second = new Product("milk", 100);
        boolean eq = first.equals(second);
        System.out.println(eq);
    }
}
