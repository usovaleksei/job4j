package ru.job4j.oop.profession;

public class Dentist extends Doctor {

    private TreatmentType treatment;

    public TreatmentType getTreatment() {
        return treatment;
    }

    public void setTreatment(TreatmentType treatment) {
        this.treatment = treatment;
    }
}
