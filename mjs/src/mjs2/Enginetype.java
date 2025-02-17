package mjs2;

public class Enginetype extends Engine{
	String gasoline;
	String diesel;
	String electric;
	
	public Enginetype() {
		System.out.println("Enginetype 호출");
	}
	

	public String getGasoline() {
		return gasoline;
	}

	public void setGasoline(String gasoline) {
		this.gasoline = gasoline;
	}

	public String getDiesel() {
		return diesel;
	}

	public void setDiesel(String diesel) {
		this.diesel = diesel;
	}

	public String getElectric() {
		return electric;
	}

	public void setElectric(String electric) {
		this.electric = electric;
	}
	
	

}
