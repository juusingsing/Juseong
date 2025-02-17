package mjs3;

public class ExBird{
	
	public static void main(String[] args) {
	Bird bird = new Bird(); 
	BirdIf birdIf = bird;
	BirdIfS birdIfS = bird; 
	
//	birdIf.MAX_BIRD_NUM1 = 10;   < 상수라서 재정의불가
	System.out.println(birdIf.MAX_BIRD_NUM1);
	
	birdIf.eatPrint1();
	birdIf.eatPrint2();    //상속관계랑 똑같이  강제한메소드만 가능
	birdIf.eatPrint3();
	
	birdIfS.eatPrint4();
	birdIfS.eatPrint5();   //상속관계랑 똑같이  강제한메소드만 가능
	birdIfS.eatPrint6();
	
	BirdTemp birdTemp = new BirdTemp();
	birdTemp.ifCPrint(birdIf);
	
	birdIf.eatPrint7();
	}

}
