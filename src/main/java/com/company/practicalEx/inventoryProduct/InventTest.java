package com.company.practicalEx.inventoryProduct;

public class InventTest {
    public static void main(String[] args) {
        Inventory some = new Inventory();
        Product bread = new Product("Bread", 12, 5);
        Product tea = new Product("Tea", 18, 10);
        Product coffee = new Product("Coffee", 11, 12);

        some.addProduct(bread, tea, coffee);

        System.out.println(some.getAveragePrice());
        System.out.println(some.getMostExpensive());
        System.out.println(some.getTotalPrice());
    }
}
