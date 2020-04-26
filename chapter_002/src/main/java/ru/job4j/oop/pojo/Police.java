package ru.job4j.oop.pojo;

import java.util.Date;

/**
 * Class  Класс с выводом данных по автомобилю
 * @author Aleksei Usov
 */
public class Police {

    //method to get data for car
    public static void main(String[] args) {
        License license = new License();
        license.setOwner("Alexey Usov");
        license.setModel("Mercedes");
        license.setCode("Y001AE77");
        license.setCreated(new Date());
        System.out.println(license.getOwner() + " has a car " + license.getModel() + " : " + license.getCode());
    }
}
