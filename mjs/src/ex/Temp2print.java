package ex;

public class Temp2print {

	public static void main(String[] args) {
		Temp2 tm = new Temp2();
		Employee em = new Manager();
		em.setName("이름");
		em.setSalary("급여");
		em.setBonus(10);
		
		tm.displayInfo(em);
	}
	
}
