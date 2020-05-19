package com.adr.javacollections;

import org.junit.Test;

import static com.adr.javacollections.ProductFixture.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class ProductCatalogueTreeSetTest {

    @Test
    public void treeShouldOnlyHoldUniqueProducts() {
        ProductCatalogueTreeSet catalogue = new ProductCatalogueTreeSet();

        catalogue.isSuppliedBy(bobs);
        catalogue.isSuppliedBy(kates);

        assertThat(catalogue, containsInAnyOrder(door, floorPanel, window));
    }

    @Test
    public void shouldFindLightVanProducts() {
        ProductCatalogueTreeSet catalogue = new ProductCatalogueTreeSet();

        catalogue.isSuppliedBy(bobs);
        catalogue.isSuppliedBy(kates);

        assertThat(catalogue.lightVanProducts(), containsInAnyOrder(window));
    }

    @Test
    public void shouldFindHeavyVanProducts() {
        ProductCatalogueTreeSet catalogue = new ProductCatalogueTreeSet();

        catalogue.isSuppliedBy(bobs);
        catalogue.isSuppliedBy(kates);

        assertThat(catalogue.heavyVanProducts(), containsInAnyOrder(door, floorPanel));
    }
}