package ru.job4j.practice;

import java.util.Scanner;

public class PracticeString {


    public static void main(String[] args) {
        String str1 = new String("Первый способ создания строки");
        String str2 = "Второй способ создания строки";
        String str3 = new String(str2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3.length());
        System.out.println(str1.charAt(0));
        System.out.println(str2.equals(str1));
        System.out.println(str2.compareTo(str1));
        System.out.println(str1.indexOf("имя"));
        System.out.println(str1.lastIndexOf("с"));

        for (int i=0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));
        }

        String str4 = str1 + " " + str2 + " " + str3;
        System.out.println(str4);

        str1 = "Пробуем изменить строку 1";
        System.out.println(str1);

        String str[] = {"Эта", "строка", "является", "тестом"};
        for (String s: str)
            System.out.println(s + " ");

        str[2] = "изменяем";
        str[3] = "строку";
        System.out.println("Измененный массив:");
        for (String s: str)
            System.out.println(s + " ");

        String str5 = "Экспериментальная строка";
        String substr = str5.substring(0, 11);
        System.out.println("str: " + str5);
        System.out.println("substr: " + substr);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите команду: ");
        String command = scanner.nextLine();

        switch (command) {
            case "connect":
                System.out.println("Подключение");
                break;
            case "cancel":
                System.out.println("Отмена");
                break;
            case "disconnect":
                System.out.println("отключение");
                break;
            default:
                System.out.println("Неверная команда");
                break;
        }
        System.out.println(args.length);
    }
}

