package ru.job4j.oop;

//создание подкласса в результате расширения класса Animal
public class Predator extends Animal {
    public Predator() {
        //вызов конструктора без параметров суперкласса Animal
        super();
        System.out.println("load Animal");
    }
}
