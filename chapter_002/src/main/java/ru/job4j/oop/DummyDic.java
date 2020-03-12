package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String frase = ("Неизвестное слово. " + eng);
        return frase;
    }

    public static void main (String[] args) {
        DummyDic row = new DummyDic();
        String say = row.engToRus("word");
        System.out.println(say);
    }
}
