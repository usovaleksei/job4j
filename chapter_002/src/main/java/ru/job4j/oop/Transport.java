package ru.job4j.oop;

/**
 * Class example to create interface
 * @author Aleksei Usov
 * @since 08/06/2020
 */

public interface Transport {

    /**
     * method display that bus ride
     */

    void drive();

    /**
     * method disply number of passengers in the bus
     *
     * @param passengerValue
     */

    void passengers(int passengerValue);

    /**
     * method disply number of passengers in the bus
     *
     * @param gasValue
     * @return gas cost
     */

    int refuel(int gasValue);

}
