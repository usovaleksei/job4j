package ru.job4j.oop.pojo;

import java.time.LocalDate;

/**
 * Class  Class for student data
 * @author Aleksei Usov
 */
public class College {
    //method to display student data
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Usov Alexey Evgenevich");
        student.setGroup("programming");
        student.setAdmission(LocalDate.of(2019, 12, 3));

        System.out.println("Student - " + student.getName() + " is studying in group " + student.getGroup() + " since " + student.getAdmission());
    }
}
