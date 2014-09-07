package io.github.celebes.headfirst.ooad.guitarshop;

import io.github.celebes.headfirst.ooad.guitarshop.enums.Builder;
import io.github.celebes.headfirst.ooad.guitarshop.enums.Type;
import io.github.celebes.headfirst.ooad.guitarshop.enums.Wood;

import java.util.List;

public class FindGuitarTester {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER,
				"Stratocastor", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER);

		List<Guitar> foundGuitars = inventory.search(whatErinLikes);

		if (!foundGuitars.isEmpty()) {
			System.out.println("Erin, you might like these guitars:");
			for (Guitar guitar : foundGuitars) {
				GuitarSpec spec = guitar.getSpec();

				System.out.println("  We have a " + spec.getBuilder() + " "
						+ spec.getModel() + " " + spec.getNumStrings()
						+ "-string " + spec.getType() + " guitar:\n     "
						+ spec.getBackWood() + " back and sides,\n     "
						+ spec.getTopWood()
						+ " top.\n  You can have it for only $"
						+ guitar.getPrice() + "!\n  ----");
			}
		} else {
			System.out.println("Sorry, Erin, we have nothing for you.");
		}
	}

	private static void initializeInventory(Inventory inventory) {
		GuitarSpec erinSpec = new GuitarSpec(Builder.FENDER, "Stratocastor",
				Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER);

		inventory.addGuitar("V95693", 1499.95, erinSpec);
		inventory.addGuitar("V9512", 1549.95, erinSpec);
	}
}
