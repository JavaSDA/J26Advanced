package com.company.practicalEx.inventoryProduct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Inventory {
    private List<Product> products;

    public Inventory() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product... products) {
        this.products.addAll(Arrays.asList(products));
    }

    public List<Product> quantityGreater(int units) {
        return this.products
                .stream()
                .filter(product -> product.getQuantity() >= units)
                .collect(Collectors.toList());
    }

    public List<Product> getProductsLessThan(float price) {
        return this.products
                .stream()
                .filter(product -> product.getPrice() < price)
                .collect(Collectors.toList());
    }

    public float getTotalPrice() {
        return (float) this.products
                .stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public float getAveragePrice() {
        return (float) this.products
                .stream()
                .mapToDouble(Product::getPrice)
                .average()
                .orElse(0.0f);
    }

    public Product getMostExpensive() {
        return this.products
                .stream()
                .max(Comparator.comparingDouble(Product::getPrice))
                .orElse(null);
    }

}
