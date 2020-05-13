package com.adr.javacollections;

import static com.adr.javacollections.ProductFixture.door;
import static com.adr.javacollections.ProductFixture.floorPanel;
import static com.adr.javacollections.ProductFixture.window;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import com.adr.javacollections.Product;
import com.adr.javacollections.Shipment;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ShipmentTest {

	private static Shipment shipment;

	@Before
	public static void initObjects() {
		shipment = new Shipment();
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
