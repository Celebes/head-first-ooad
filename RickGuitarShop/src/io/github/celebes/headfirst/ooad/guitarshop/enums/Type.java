package io.github.celebes.headfirst.ooad.guitarshop.enums;

public enum Type {
	ACOUSTIC, ELECTRIC;
	
	public String toString() {
		switch(this) {
		case ACOUSTIC: return "acoustic";
		case ELECTRIC: return "electric";
		default: return "unknown type";
		}
	}
}
