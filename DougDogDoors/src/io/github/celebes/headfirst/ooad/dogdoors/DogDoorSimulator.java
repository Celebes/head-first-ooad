package io.github.celebes.headfirst.ooad.dogdoors;

public class DogDoorSimulator {
	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		Remote remote = new Remote(door);
		
		System.out.println("Fido barks to go outside...");
		remote.pressButton();
		
		System.out.println("\nFido has gone outside...");

		System.out.println("\nFido is all done...");
		
		System.out.println("\nFido is back inside...");
	}
}
