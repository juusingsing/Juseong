package mjs3;

public class Ex1{
	
	public static void main(String[] args) {

		SleddingSports sp = new SleddingSports();
		
		if(sp instanceof SleddingSports) {
			//바이애슬론
			Biathlon b = new Biathlon();
			b.setScore("10");  //점수
			b.setPerson(1);    //사람수
			b.setMedalCheck(false); //메달유무
			sp.setMedalSum("0");  //메달 총개수
			sp.setJoinCheck(false);  //참가유무
			sp.printBiathlon(b);
		}else {
		System.out.println("미출력");
		}
	}

}
