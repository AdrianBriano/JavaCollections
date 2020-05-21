package com.adr.javacollections.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static com.adr.javacollections.maps.ProductFixture.*;

public class java8Enhancements {

    public static void main(String[] args) {

        Product defaultProduct = new Product(-1, "Whatever the customer wants", 100);

        Map<Integer, Product> idToProduct = new HashMap<>();
        idToProduct.put(1, door);
        idToProduct.put(2, floorPanel);
        idToProduct.put(3, window);

        Product result;
//        result = idToProduct.get(10);
//        System.out.println(result);

//        result = idToProduct.getOrDefault(10, defaultProduct);
//        System.out.println(result);

//        result = idToProduct.replace(4, new Product(1, "Big door", 100));
//        System.out.println(result);

//        System.out.println(idToProduct);
//        idToProduct.replaceAll((id, oldProduct) ->
//                new Product(id, oldProduct.getName(), oldProduct.getWeight() + 10)
//        );
//
        System.out.println(idToProduct);

        result = idToProduct.computeIfPresent(10, (id, oldProduct) ->
                new Product(id, "Custom", oldProduct.getWeight() + 10)
            );
        System.out.println(result);
        System.out.println(idToProduct);

    }
}
