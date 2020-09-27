package ru.job4j.collections;

import java.util.Objects;

/**
 * Class data model Order item
 * @author Aleksei Usov
 * @since 28/09/2020
 */

public class Order {
    private String number;
    private String name;

    public Order(String number, String name) {
        this.number = number;
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Order{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return number.equals(order.number) &&
                name.equals(order.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name);
    }
}
