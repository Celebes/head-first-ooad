package io.github.celebes.headfirst.ooad.dogdoors;

public class DogDoorSimulator {
	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		BarkRecognizer recognizer = new BarkRecognizer(door);
		
		// Simulate the hardware hearing a bark
		System.out.println("Fido starts barking.");
		recognizer.recognize("Woof");
		
		System.out.println("\nFido has gone outside...");
		System.out.println("\nFido is all done...");
		
		try {
			Thread.currentThread().sleep(10000);
		} catch(InterruptedException e) {
			
		}
		
		System.out.println("...but he's stuck outside!");

		// Simulate the hardware hearing a bark again
		System.out.println("Fido starts barking.");
		recognizer.recognize("Woof");
		
		System.out.println("\nFido's back inside...");
	}
}
