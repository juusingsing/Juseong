package mjs3;

public class Biathlon extends SleddingSports{
	//점수
	private String score;
	//사람수
	private int person;
	//메달유무
	private boolean medalCheck;
	
	public Biathlon() {
		System.out.println("바이애슬론 출력");
	}

	public Biathlon(String score, int person, boolean medalCheck) {
		this.score = score;
		this.person = person;
		this.medalCheck = medalCheck;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public int getPerson() {
		return person;
	}

	public void setPerson(int person) {
		this.person = person;
	}

	public boolean isMedalCheck() {
		return medalCheck;
	}

	public void setMedalCheck(boolean medalCheck) {
		this.medalCheck = medalCheck;
	}
	
	
}
