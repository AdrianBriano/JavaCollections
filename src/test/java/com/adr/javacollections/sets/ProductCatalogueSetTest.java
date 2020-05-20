package com.adr.javacollections.sets;

import org.junit.Test;

import static com.adr.javacollections.sets.ProductFixture.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class ProductCatalogueSetTest {

    @Test
    public void shouldOnlyHoldUniqueProducts() {
        ProductCatalogueSet catalogue = new ProductCatalogueSet();

        catalogue.isSuppliedBy(bobs);
        catalogue.isSuppliedBy(kates);

        assertThat(catalogue, containsInAnyOrder(door, floorPanel, window));
    }
}