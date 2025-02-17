package mjs3;

public class print {

	public static void main(String[] args) {
		//바이애슬론
		Biathlon b = new Biathlon();
		SleddingSports sp = new SleddingSports("0", false);  // 메달 총개수, 참가유무
		b.setScore("10");  //점수
		b.setPerson(1);    //사람수
		b.setMedalCheck(false); //메달유무
//		sp.setMedalSum("0");  //메달 총개수
//		sp.setJoinCheck(false);  //참가유무
		sp.printBiathlon(b);
		
		//봅슬레이
		Bobsleigh bob = new Bobsleigh();
		bob.setScore("5"); //점수
		bob.setPerson(4); //사람수
		bob.setMedalCheck(true); //메달유무
		sp.setMedalSum("1"); //메달 총개수
		sp.setJoinCheck(true); //참가유무
		sp.printBobsleigh(bob);
		
		
		//스켈레톤
		Skeleton skel = new Skeleton();
		skel.setScore("100"); //점수
		skel.setPerson(2); //사람수
		skel.setMedalCheck(true); //메달유무
		sp.setMedalSum("3"); //메달 총개수
		sp.setJoinCheck(true); //참가유무
		sp.printSkeleton(skel);

	}

}
