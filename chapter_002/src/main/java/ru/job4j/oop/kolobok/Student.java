package ru.job4j.oop.kolobok;

public class Student {

    public void music(String lyrics) {
        System.out.println("I can sing a song : " + lyrics);
    }

        public static void main(String[] args) {
        Student petya = new Student();
        String song = "I believe, I can fly";
        petya.music(song);
    }
}
