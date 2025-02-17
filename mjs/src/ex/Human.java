package ex;

public class Human {
	//이름
	private String name;
	//나이
	private String age;
	//성별
	private String gender;
	// private 는 상속에서 제한된다
	
	public Human() {
		System.out.println("Human 호출");
	}
	
	public Human(String name, String age) {
		this.name = name;
		this.age = age;
		System.out.println("Human 호출");
	}
	
	public Human(String gender) {
		this.gender = gender;
		System.out.println("Human 호출");
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	
}
