package ru.job4j.oop.kolobok;

/**
 * Class  Перегрузка конструктовров при наследовании классов
 */

//создание подкласса в результате расширения класса Predator
public class Tiger extends Predator {

    //конструктор без параметров
    public Tiger() {
        super();
        System.out.println("load Predator");
    }

    //перегруженный констркутор с параметром name1
    public Tiger(String name1) {
        super(name1);
        System.out.println("load Predator");
    }

    public static void main(String[] args) {
        Tiger tiger1 = new Tiger();
        System.out.println();
        Tiger tiger2 = new Tiger("Vasya");
        System.out.println();
    }
}
