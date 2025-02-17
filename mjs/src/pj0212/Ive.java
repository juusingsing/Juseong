package pj0212;

public class Ive {
	//멤버수
	int member;
	//데뷔일자
	double debut;

	public Ive() {
		System.out.println("부모클래스 실행");
	}
	
	public Ive(int member, double debut) {
		this.member = member;
		this.debut = debut;
		System.out.println("부모클래스(2) 실행");
	}
	
	public void IvePrint() {
		System.out.println("IvePrint 호출");
	}
	
	

	public int getMember() {
		return member;
	}

	public void setMember(int member) {
		this.member = member;
	}

	public double getDebut() {
		return debut;
	}

	public void setDebut(double debut) {
		this.debut = debut;
	}
	
}
