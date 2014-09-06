package io.github.celebes.headfirst.ooad.guitarshop;

import io.github.celebes.headfirst.ooad.guitarshop.enums.Builder;
import io.github.celebes.headfirst.ooad.guitarshop.enums.Type;
import io.github.celebes.headfirst.ooad.guitarshop.enums.Wood;

import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List<Guitar> guitars;

	public Inventory() {
		guitars = new LinkedList<>();
	}

	public void addGuitar(String serialNumber, double price, Builder builder,
			String model, Type type, Wood backWood, Wood topWood) {
		Guitar guitar = new Guitar(serialNumber, price, builder, model, type,
				backWood, topWood);
		guitars.add(guitar);
	}
	
	public Guitar getGuitar(String serialNumber) {
		for(Guitar guitar : guitars) {
			if(guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}
		}
		
		return null;
	}
	
	public Guitar search(Guitar searchGuitar) {
		for(Guitar guitar : guitars) {
			// ignoruj numer seryjny, bo jest unikatowy
			// ignoruj cene, bo jest unikatowa
			
			if(searchGuitar.getBuilder() != guitar.getBuilder()) {
				continue;
			}
			
			String model = searchGuitar.getModel().toLowerCase();
			if((model != null) && (!model.equals("")) && (!model.equals(guitar.getModel().toLowerCase()))) {
				continue;
			}
			
			if(searchGuitar.getType() != guitar.getType()) {
				continue;
			}
			
			if(searchGuitar.getBackWood() != guitar.getBackWood()) {
				continue;
			}
			
			if(searchGuitar.getTopWood() != guitar.getTopWood()) {
				continue;
			}
			
			return guitar;
		}
		
		return null;
	}
}
