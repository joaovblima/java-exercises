package application;

import entities.Product;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        Map<Product, Double> stock = new HashMap<>();

        Product p1 = new Product("TV", 1000.0);
        Product p2 = new Product("Notebook", 2000.0);
        Product p3 = new Product("Tablet", 400.0);

        stock.put(p1, 1100.0);
        stock.put(p2, 2100.0);
        stock.put(p3, 500.0);

        Product ps = new Product("TV", 1000.0);

        System.out.println("Cookies: " + stock.containsKey(ps));
    }
}
