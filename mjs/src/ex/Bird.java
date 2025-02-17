package ex;

public class Bird {

	private String type; // 새 종류
	private String color; //새 색깔
	
	String age;
	String gender;
	String species;
	
	
	public Bird() {
		System.out.println("Bird 호출");
	}
	
	public Bird(String type, String color) {
		this.type = type;
		this.color = color;
		System.out.println("Bird 호출");
	}
	
	public void eat() {
		System.out.println("부모가 먹다");
	}
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
	public String getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getSpecies() {
		return species;
	}

		public void setAge(String age) {
			this.age = age;
		}
		
		public void setGender(String gender) {
			this.gender = gender;
		}
		
		public void setSpecies(String species) {
			this.species = species;
		}
	
	
	
}
