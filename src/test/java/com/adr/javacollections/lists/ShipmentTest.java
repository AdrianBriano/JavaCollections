package com.adr.javacollections.lists;

import static com.adr.javacollections.lists.ProductFixture.door;
import static com.adr.javacollections.lists.ProductFixture.floorPanel;
import static com.adr.javacollections.lists.ProductFixture.window;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class ShipmentTest {

    private static Shipment shipment;

    @Before
    public void initObjects() {
        shipment = new Shipment();
    }

    @Test
    public void shouldAddItems() {

        shipment.add(door);
        shipment.add(window);

        assertThat(shipment, hasItems(door, window));
    }

    @Test
    public void shouldReplaceitems() {

        shipment.add(door);
        shipment.add(window);

        shipment.replace(door, floorPanel);

        assertThat(shipment, hasItems(window, floorPanel));
    }

    @Test
    public void shouldNotReplaceMissingItems() {

        shipment.add(window);

        shipment.replace(door, floorPanel);

        assertThat(shipment, hasItem(window));
    }

    @Test
    public void shouldIdentifyVanRequirements() {

        shipment.add(window);
        shipment.add(floorPanel);
        shipment.add(door);

        shipment.prepare();

        assertThat(shipment.getLightVanProducts(), hasItem(window));
        assertThat(shipment.getHeavyVanProducts(), hasItems(door, floorPanel));
    }
}
