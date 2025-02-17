package mjs3;

public class BirdTemp {
	
	public void ifCPrint(BirdIf birdIf) {
		if(birdIf instanceof Bird) {
			Bird bird = (Bird) birdIf;
			bird.eatPrint1();
		}
	}

}
