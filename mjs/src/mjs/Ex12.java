package mjs;
import ex.Student;

public class Ex12 {

	public static void main(String[] args) {
		// st 변수 = Student 생성자 ???
		Student st = new Student("이름", "25", "1학년"); // string 3자리 student 생성자실행
		Student st2 = new Student("성별", "학과");
//		st.setGender("성별");
//		st.setSpecialty("학과");
		st.setDepartment("조직");
		System.out.println(st.StudentString());
		
	}

}

