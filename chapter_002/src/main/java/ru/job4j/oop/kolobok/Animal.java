package ru.job4j.oop.kolobok;

//создание суперкласса
public class Animal {
    public String name;

    //конструктор без параметров
    public Animal() {
        super();
        System.out.println("load Object");
    }

    //перегруженный конструктор с параметром name
    public Animal(String nick) {
        name = nick;
        System.out.println("load Object");
    }
}
