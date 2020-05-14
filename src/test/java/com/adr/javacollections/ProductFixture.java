package com.adr.javacollections;

public class ProductFixture {
    public static Product door = new Product("Wooden door", 35);
    public static Product floorPanel = new Product("Floor panel", 25);
    public static Product window = new Product("Window", 10);

    public static Supplier bobs = new Supplier("Bob's  Household Supplies");
    public static Supplier kates = new Supplier("Kate's  Home Goods");

    static {

        bobs.getProducts().add(door);
        bobs.getProducts().add(floorPanel);

        kates.getProducts().add(floorPanel);
        kates.getProducts().add( new Product("Wooden door", 35));
    }

}
