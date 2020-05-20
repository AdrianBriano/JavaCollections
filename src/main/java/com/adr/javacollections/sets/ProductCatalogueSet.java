package com.adr.javacollections.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProductCatalogueSet implements Iterable<Product> {

    private final Set<Product> products = new HashSet<>();

    public void isSuppliedBy(Supplier supplier) {
        products.addAll(supplier.getProducts());
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }

}
