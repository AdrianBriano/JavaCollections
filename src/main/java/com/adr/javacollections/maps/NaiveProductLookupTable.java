package com.adr.javacollections.maps;

import java.util.ArrayList;
import java.util.List;

public class NaiveProductLookupTable implements ProductLookupTable {

    private List<Product> products = new ArrayList<>();

    @Override
    public void addProduct(Product productToAdd) {
        for (Product product : products) {
            if (product.getId() == productToAdd.getId()) {
                throw new IllegalArgumentException("Product duplicated: " + productToAdd);
            }
        }

        products.add(productToAdd);
    }

    @Override
    public Product lookupById(int id) {

        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }

        return null;
    }

    @Override
    public void clear() {
        products.clear();
    }
}
