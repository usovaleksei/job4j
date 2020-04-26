package ru.job4j.oop.pojo;

import java.time.LocalDate;

/**
 * Class to create a student object
 * @author Aleksei Usov
 */
public class Student {
    private String name;
    private String group;
    private LocalDate admission;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public LocalDate getAdmission() {
        return admission;
    }

    public void setAdmission(LocalDate admission) {
        this.admission = admission;
    }
}
