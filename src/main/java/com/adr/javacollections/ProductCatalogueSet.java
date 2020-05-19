package com.adr.javacollections;

import java.util.*;

import static com.adr.javacollections.Product.BY_NAME;
import static com.adr.javacollections.Product.BY_WEIGHT;

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
