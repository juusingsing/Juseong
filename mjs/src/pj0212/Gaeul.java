package pj0212;

public class Gaeul extends Ive{
	//이름
	private String name;
	//나이
	private int age;
	//국적
	private String country;
	
	public Gaeul() {
		System.out.println("자식클래스Gaeul 실행");
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
