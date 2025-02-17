package mjs3;

public class SleddingSports {
	//메달 총개수
	private String medalSum;
	//출전유무
	private boolean joinCheck;
	
	public SleddingSports() {
		System.out.println("부모클래스 출력");
	}
	
	public SleddingSports(String medalSum, boolean joinCheck) {
		this.medalSum = medalSum;
		this.joinCheck = joinCheck;
	}
	
	public void printBiathlon(Biathlon b) {
		System.out.println(
			"score="+b.getScore() +"\n"+
			"person="+b.getPerson() +"\n"+
			"medal="+b.isMedalCheck() +"\n"+
			"medalSum="+medalSum +"\n"+
			"join="+joinCheck);
	}
	
	public void printBobsleigh(Bobsleigh bob) {
		System.out.println(
			"score="+bob.getScore() +"\n"+
			"person="+bob.getPerson() +"\n"+
			"medal="+bob.isMedalCheck() +"\n"+
			"medalSum="+medalSum +"\n"+
			"join="+joinCheck);
	}
	
	public void printSkeleton(Skeleton skel) {
		System.out.println(
			"score="+skel.getScore() +"\n"+
			"person="+skel.getPerson() +"\n"+
			"medal="+skel.isMedalCheck() +"\n"+
			"medalSum="+medalSum +"\n"+
			"join="+joinCheck);
	}


	public String getMedalSum() {
		return medalSum;
	}


	public void setMedalSum(String medalSum) {
		this.medalSum = medalSum;
	}


	public boolean isJoinCheck() {
		return joinCheck;
	}


	public void setJoinCheck(boolean joinCheck) {
		this.joinCheck = joinCheck;
	}
	

}
