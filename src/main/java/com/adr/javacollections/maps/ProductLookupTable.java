package com.adr.javacollections.maps;

public interface ProductLookupTable {

    public void addProduct(Product productToAdd);

    Product lookupById(int id);

    void clear();

}
