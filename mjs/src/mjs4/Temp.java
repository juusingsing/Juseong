package mjs4;

public class Temp {
	
	public void BirdPrints(BirdIf birdif, BirdIfS birdifs, BirdIfT birdift) {
		if(birdif instanceof Bird) {
			birdif.BirdPrint1();
			birdif.BirdPrint2();
			birdif.BirdPrint3();
			Bird bird = (Bird)birdif;
			bird.eatPrint();
		}
		if(birdifs instanceof Bird) {
			birdifs.BirdPrint4();
			birdifs.BirdPrint5();
			birdifs.eatPrints();
			Bird bird = (Bird)birdifs;
			
		}
		if(birdift instanceof Bird) {
			birdift.BirdPrint6();
			birdift.BirdPrint7();
			birdift.BirdPrint8();
			Bird bird = (Bird)birdift;
			bird.eatPrintt();
		}

	}

}
