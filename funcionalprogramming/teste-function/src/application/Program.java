package application;

import entities.Product;
import util.UpperCaseName;
import util.util.addTax;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("tv", 1200.0));
        list.add(new Product("tablet", 950.0));
        list.add(new Product("mouse", 500.0));
        list.add(new Product("hd case", 700.0));

        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).toList();
        names.forEach(System.out::println);

        List<Double> prices = list.stream().map(p -> p.getPrice()*1.1).toList();
        prices.forEach(System.out::println);

    }
}
