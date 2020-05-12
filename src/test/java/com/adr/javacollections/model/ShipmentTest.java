package com.adr.javacollections.model;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.BeforeClass;
import org.junit.Test;

public class ShipmentTest {

	private static Shipment shipment;
	static Product door;
	static Product floorPanel;
	static Product window;

	@BeforeClass
	public static void initObjects() {

		shipment = new Shipment();
		door = new Product("Wooden door", 35);
		floorPanel = new Product("Floor panel", 25);
		window = new Product("Window", 10);

	}

	@Test
	public void shouldAddItems() {

		shipment.add(door);
		shipment.add(window);
		
		assertThat(shipment, hasItems(door, window));
		
	}

}
