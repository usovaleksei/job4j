package ru.job4j.collections;

import java.util.HashMap;
import java.util.List;

/**
 * Class convert list to map
 * @author Aleksei Usov
 * @since 28/09/2020
 */

public class OrderConvert {
    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();
        for (Order element : orders) {
            map.put(element.getNumber(), element);
        }
        return map;
    }
}
