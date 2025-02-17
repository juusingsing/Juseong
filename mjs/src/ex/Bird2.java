package ex;

public class Bird2  extends Bird{

	private String size; // 새 크기
	private String cute; // 귀여운지
	
	
	public void eat() {
		System.out.println("자식이 먹다");
	}
	
	
	public Bird2(String type, String color, String size, String cute){
		super(type, color);
		this.size = size;
		this.cute = cute;
		System.out.println("Bird2 호출");	
	}
	
	public String Birdprint() {
		return
		"type=" + super.getType()
		+ "color=" + super.getColor()
		+ "size=" + size
		+ "cute=" + cute;
	}
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getCute() {
		return cute;
	}
	public void setCute(String cute) {
		this.cute = cute;
	}
	
	
	
}
