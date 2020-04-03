package ru.job4j.oop;

/**
 * Class  Класс показывает порядок вызова конструктовров при наследовании классов
 */

//сздание подкласса в результате расширения класса Predator
public class Tiger extends Predator {

    public Tiger() {
        //вызов конструктора без параметров суперкласса Predator
        super();
        System.out.println("load Predator");
    }

    public static void main(String[] args) {
        Tiger tiger1 = new Tiger();
        System.out.println();

        Predator pred1 = new Predator();
        System.out.println();

        Animal an1 = new Animal();
        System.out.println();
    }

}
