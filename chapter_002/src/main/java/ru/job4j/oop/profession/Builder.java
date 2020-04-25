package ru.job4j.oop.profession;

public class Builder extends Engineer {

    private House house;

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
}
