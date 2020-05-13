package com.adr.javacollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shipment implements Iterable<Product> {

    private List<Product> productList = new ArrayList<>();
    private List<Product> lightProductsList = new ArrayList<>();
    private List<Product> heavyProductsList = new ArrayList<>();

    public void add(Product product) {
        productList.add(product);
    }

    public void replace(Product oldProduct, Product newProduct) {

        int productIndex = productList.indexOf(oldProduct);

        if (productIndex != -1) {
            productList.set(productIndex, newProduct);
        }
    }

    public void prepare() {
        productList.forEach(product -> {
            if (product.getWeight() < 20) {
                lightProductsList.add(product);
            } else {
                heavyProductsList.add(product);
            }
        });
    }

    public List<Product> getLightVanProducts() {
        return lightProductsList;
    }

    public List<Product> getHeavyVanProducts() {
        return heavyProductsList;
    }

    @Override
    public Iterator<Product> iterator() {
        return productList.iterator();
    }
}
