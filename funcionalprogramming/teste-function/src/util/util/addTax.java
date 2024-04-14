package util.util;

import entities.Product;

import java.util.function.Function;

public class addTax implements Function<Product, Double> {


    @Override
    public Double apply(Product product) {
        return product.getPrice() * 1.1;
    }

}
