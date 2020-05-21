package com.adr.javacollections.maps;

import java.util.*;

import static com.adr.javacollections.maps.ProductFixture.*;

public class ViewsOverMaps {

    public static void main(String[] args) {

        Map<Integer, Product> idToProduct = new HashMap<>();
        idToProduct.put(1, door);
        idToProduct.put(2, floorPanel);
        idToProduct.put(3, window);

        idToProduct.forEach( (k,v) ->
                        System.out.println( k + " -> " + v)
                );

//        System.out.println(idToProduct);
//        System.out.println("\n");

//        Set<Integer> ids = idToProduct.keySet();
//        System.out.println(ids);
//        System.out.println("\n");

//        ids.remove(1);
//        System.out.println(ids);
//        System.out.println(idToProduct);
//        System.out.println("\n");

//        ids.add(4);
//        idToProduct.put(4 , null );

        Collection<Product> products = idToProduct.values();
//        System.out.println(products);

//        products.remove(floorPanel);
//        System.out.println(products);
//        System.out.println(idToProduct);

        Set<Map.Entry<Integer, Product>> entries = idToProduct.entrySet();
        for (Map.Entry<Integer, Product> entry : entries) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }



    }
}
