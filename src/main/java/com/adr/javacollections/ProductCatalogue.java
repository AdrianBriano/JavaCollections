package com.adr.javacollections;

import java.util.*;

import static com.adr.javacollections.Product.BY_NAME;

public class ProductCatalogue implements Iterable<Product> {

//    private final Set<Product> products = new HashSet<>();
    private final Set<Product> products = new TreeSet<>(BY_NAME);

    public void isSuppliedBy(Supplier supplier) {
        products.addAll(supplier.getProducts());
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
