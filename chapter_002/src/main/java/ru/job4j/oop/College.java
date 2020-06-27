package ru.job4j.oop;

public class College {

    public static void main (String[] args) {
        //create object Freshman class
        Freshman freshman = new Freshman();
        //make cast the type of parent Student
        Student st = freshman;
        //make cast the type of parent Object
        Object obj = freshman;
    }
}
