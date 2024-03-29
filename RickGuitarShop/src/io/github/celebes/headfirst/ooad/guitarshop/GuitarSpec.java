package io.github.celebes.headfirst.ooad.guitarshop;

import io.github.celebes.headfirst.ooad.guitarshop.enums.Builder;
import io.github.celebes.headfirst.ooad.guitarshop.enums.Type;
import io.github.celebes.headfirst.ooad.guitarshop.enums.Wood;

public class GuitarSpec {
	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;
	private int numStrings;

	public GuitarSpec(Builder builder, String model, Type type, int numStrings, Wood backWood, Wood topWood) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.numStrings = numStrings;
		this.backWood = backWood;
		this.topWood = topWood;
	}

	public Builder getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public Type getType() {
		return type;
	}
	
	public int getNumStrings() {
		return numStrings;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof GuitarSpec) {
			GuitarSpec guitarSpec = (GuitarSpec)obj;
			
			if(builder != guitarSpec.builder) {
				return false;
			}

			if((model != null) && (!model.equals(""))
					&& (!model.toLowerCase().equals(guitarSpec.model.toLowerCase()))) {
				return false;
			}

			if(type != guitarSpec.type) {
				return false;
			}
			
			if(numStrings != guitarSpec.numStrings) {
				return false;
			}

			if(backWood != guitarSpec.backWood) {
				return false;
			}

			if(topWood != guitarSpec.topWood) {
				return false;
			}
			
			return true;
		}
		
		return false;
	}
}
