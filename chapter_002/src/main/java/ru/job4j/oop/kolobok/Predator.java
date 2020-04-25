package ru.job4j.oop.kolobok;

//создание подкласса в результате расширения класса Animal
public class Predator extends Animal {

    //конструктор без параметров
    public Predator() {
        super();
        System.out.println("load Animal");
    }

    //перегруженный конструктор с параметром name2
    public Predator(String name2) {
        super(name2);
        System.out.println("load Animal");
    }
}
