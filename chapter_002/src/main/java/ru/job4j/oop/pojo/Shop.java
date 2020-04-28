package ru.job4j.oop.pojo;

/**
 * Class removing models from an array
 * @author Aleksei Usov
 */

public class Shop {

    //method to delete array cell
    public static Product[] delete (Product[] products, int index) {
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }
        products[products.length - 1] = null;
        return products;
    }

    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("milk", 10);
        products[2] = new Product("bread", 4);
        products[3] = new Product("egg", 19);

        for (int index = 0; index < products.length; index++) {
            Product prod = products[index];
            if (prod != null) {
                System.out.println(prod.getName() + " : " + prod.getCount());
            } else {
                System.out.println("null");
            }
        }
        System.out.println();

        delete(products, 1);
        for (int index = 0; index < products.length; index++) {
            Product prod = products[index];
            if (prod != null) {
                System.out.println(prod.getName() + " : " + prod.getCount());
            } else {
                System.out.println("null");
            }
        }
     }
}

