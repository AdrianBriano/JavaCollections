package com.adr.javacollections.queues;

public class Enquiry {

    private Customer customer;
    private Category category;

    public Enquiry(Customer customer, Category category) {
        this.customer = customer;
        this.category = category;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Enquiry{" +
                "customer=" + customer +
                ", category=" + category +
                '}';
    }
}
