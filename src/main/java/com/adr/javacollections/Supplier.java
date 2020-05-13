package com.adr.javacollections;

import java.util.ArrayList;
import java.util.List;

public class Supplier {

    private String supplierLegend;
    private List<Product> products = new ArrayList<>();

    public Supplier(String supplierLegend) {
        this.supplierLegend = supplierLegend;
    }

    public String getSupplierLegend() {
        return supplierLegend;
    }

    public void setSupplierLegend(String supplierLegend) {
        this.supplierLegend = supplierLegend;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierLegend='" + supplierLegend + '\'' +
                ", products=" + products +
                '}';
    }
}

