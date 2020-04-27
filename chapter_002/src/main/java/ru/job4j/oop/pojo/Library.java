package ru.job4j.oop.pojo;

/**
 * Class library
 * @author Aleksei Usov
 */

public class Library {
    //method displays array of book from library
    public static void main(String[] args) {
        Book java = new Book("Java", 850);
        Book sql = new Book("SQL", 515);
        Book cleancode = new Book("Clean Code", 740);
        Book html = new Book("HTML 5.0", 320);

        Book[] arrbook = new Book[4];
        arrbook[0] = java;
        arrbook[1] = sql;
        arrbook[2] = cleancode;
        arrbook[3] = html;

        for (int index = 0; index < arrbook.length; index++) {
            Book ab = arrbook[index];
            System.out.println("Book name: " + ab.getName() + " number of pages - " + ab.getCountpage());
        }

        System.out.println("\n");
        System.out.println("Show only book with name Clean Code");
        for (int index = 0; index < arrbook.length; index++) {
            Book ab = arrbook[index];
            String str = "Clean Code";
            if (ab.getName().equals(str)) {
                System.out.println("Book name: " + ab.getName() + " number of pages " + ab.getCountpage());
            }
        }
    }
}
