package pj0212;

public class Liz extends Ive{
	//이름
	private String name;
	//나이
	private int age;
	//국적
	private String country;
	
	public Liz() {
		System.out.println("자식클래스Liz 실행");
	}
	
	public Liz(String name, int age, String country) {
		this.name = name;
		this.age = age;
		this.country = country;
		System.out.println("자식클래스Liz(3) 실행");
	}
	
	public Liz(int member, double debut, String name, int age, String country) {
		super(member, debut);
		this.name = name;
		this.age = age;
		this.country = country;
		System.out.println("자식클래스(5) 실행");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
