package ru.job4j.oop.profession;

public class Doctor extends Proffesion {

    private Diagnose diagnose;

    public Diagnose getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(Diagnose diagnose) {
        this.diagnose = diagnose;
    }

}
