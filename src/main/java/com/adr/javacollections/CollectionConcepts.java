package com.adr.javacollections;

import com.adr.javacollections.lists.Product;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionConcepts {

    public static void main(String[] args) {
        Product door = new Product("Wooden door", 35);
        Product floorPanel = new Product("Floor panel", 25);
        Product window = new Product("Window", 10);

        Collection<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);

//        System.out.println(products);
//
//        Iterator<Product> productIterator1 = products.iterator();
//        while (productIterator1.hasNext()) {
//            Product product = productIterator1.next();
//
//            System.out.println(product);
//        }
//
//        for (Product product : products) {
//            System.out.println(product);
//        }
//
//        Iterator<Product> productIterator2 = products.iterator();
//        while (productIterator2.hasNext()) {
//
//            Product product = productIterator2.next();
//
//            if (product.getWeight() > 20) {
//                System.out.println(product);
//            } else {
//                productIterator2.remove();
//            }
//        }
//
//        System.out.println(products);
//        System.out.println(products.size());
//        System.out.println(products.isEmpty());
//
//        System.out.println(products.contains(window));
//        System.out.println(products.contains(door));
//
//        Collection<Product> otherProducts = new ArrayList<>();
//        otherProducts.add(window);
//        otherProducts.add(door);
//
//        products.removeAll(otherProducts);
//        System.out.println(products);

        for (Product product : products) {

            if (product.getWeight() > 20) {
                System.out.println(product);
            } else {
                products.remove(product);
            }
        }

        System.out.println(products);

    }
}
