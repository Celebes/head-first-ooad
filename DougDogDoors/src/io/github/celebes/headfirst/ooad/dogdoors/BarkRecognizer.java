package io.github.celebes.headfirst.ooad.dogdoors;

public class BarkRecognizer {
	private DogDoor door;
	
	public BarkRecognizer(DogDoor door) {
		this.door = door;
	}
	
	public void recognize(String bark) {
		System.out.println("    BarkRecognizer: Heard a `" + bark + "`");
		door.open();
	}
}
