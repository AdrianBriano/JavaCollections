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
		window = new Product("Window", 10);
		door = new Product("Wooden door", 35);
		floorPanel = new Product("Floor panel", 25);
	}

	@Test
	public void shouldAddItems() {

		shipment.add(door);
		shipment.add(window);
		
		assertThat(shipment, hasItems(door, window));
	}

	@Test
	public void shouldReplaceitems(){

		shipment.add(door);
		shipment.add(window);

		shipment.replace(door, floorPanel);

		assertThat(shipment, hasItems(window, floorPanel));
	}

	@Test
	public void shouldNotReplaceMissingItems(){

		shipment.add(window);

		shipment.replace(door, floorPanel);

		assertThat(shipment, hasItem(window));
	}

	@Test
	public void shouldIdentifyVanRequirements(){

		shipment.add(window);
		shipment.add(floorPanel);
		shipment.add(door);

		shipment.prepare();

		assertThat(shipment.getLightVanProducts(), hasItem(window));
		assertThat(shipment.getHeavyVanProducts(), hasItems(door, floorPanel));
	}
}
