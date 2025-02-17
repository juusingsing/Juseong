package mjs;

public class Penguin {
	
	private String age;
	private String gender;
	private String species;
	
	public Penguin() {
		System.out.println("Penguin 호출");
	}
	
	public Penguin(String age, String gender, String species) {
		this.age = age;
		this.gender = gender;
		this.species = species;
		System.out.println("Penguin 호출");
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

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

}
