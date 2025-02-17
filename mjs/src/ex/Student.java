package ex;

// public class 자식클래스  extends 부모클래스
public class Student extends Human {
	//학년
	private String grade;
	//전공
	private String specialty;
	//조직
	private String department;
	
	public Student() {
		super();
		System.out.println("Student 호출");
	}
	
	public Student(String name, String age, String grade) {
		super(name, age);
		this.grade = grade;
		System.out.println("Student 호출");
	}
	
	public Student(String gender, String specialty) {
		super(gender);
		this.specialty = specialty;
		System.out.println("Student 호출");
	}
	
	
	
	public String StudentString() {
		return
		"Human [name=" + super.getName()
		+ "age=" + super.getAge()
		+ "gender=" + super.getGender()
		+ "grade=" + grade
		+ "specialty=" + specialty
		+ "department=" + department +"]"; 
	}
	
	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

}
