package ru.job4j.oop;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Drive by car");
    }

    @Override
    public void passengers(int passengerValue) {
        System.out.println("Value passengers to the bus: " + passengerValue);
    }

    @Override
    public int refuel(int gasValue) {
        return gasValue * 50;
    }

}
