package com.adr.javacollections.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shipment implements Iterable<Product> {

    private List<Product> productList = new ArrayList<>();

    public void add(Product product) {
        productList.add(product);
    }

    @Override
    public Iterator<Product> iterator() {
        return productList.iterator();
    }
}
