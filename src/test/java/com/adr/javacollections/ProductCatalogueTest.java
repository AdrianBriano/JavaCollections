package com.adr.javacollections;

import org.junit.BeforeClass;
import org.junit.Test;

import static com.adr.javacollections.ProductFixture.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.hasItems;

public class ProductCatalogueTest {

    @Test
    public void shouldOnlyHoldUniqueProducts() {
        ProductCatalogue catalogue = new ProductCatalogue();

        catalogue.isSuppliedBy(bobs);
        catalogue.isSuppliedBy(kates);

        assertThat(catalogue, containsInAnyOrder(door, floorPanel));
    }
}