package com.adr.javacollections.sets;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class ProductCatalogueTreeSet implements Iterable<Product> {

    public static final int LIGHT_VAN_MAX_WEIGHT = 20;

    private final SortedSet<Product> products = new TreeSet<>(Product.BY_WEIGHT);

    public void isSuppliedBy(Supplier supplier) {
        products.addAll(supplier.getProducts());
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }

    public SortedSet<Product> lightVanProducts() {

        Product product = findLightestHeavyVanProduct();

        return products.headSet(product);
    }

    public SortedSet<Product> heavyVanProducts() {

        Product product = findLightestHeavyVanProduct();

        return products.tailSet(product);
    }

    private Product findLightestHeavyVanProduct() {

        for (Product product : products) {
            if (product.getWeight() > LIGHT_VAN_MAX_WEIGHT){
                return product;
            }
        }
        return products.last();
    }

}
