package ru.job4j.oop.profession;

public class Surgeon extends Doctor {

    private Operation operation;

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }
}
