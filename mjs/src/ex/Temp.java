package ex;

public class Temp {
	
	public void getBird(Bird b) {
		
	//부모 변수 찍기
	System.out.println(
	"Bird [species="+
	b.getSpecies() +
	", age="+
	b.getAge() +
	", gender=" +
	b.getGender() + "]");
	
	//함수 실행
	b.eat();
	}

}
