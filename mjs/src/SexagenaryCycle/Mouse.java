package SexagenaryCycle;
//쥐 클래스
public class Mouse {
	//12간지  문자형     null
	private String sexagenaryCycle;
	//순서    정수형     0
	private int order;
	//생태계차지퍼센트   실수형 0.0
	private double percent;
	//잡식유무  논리형      false
	private boolean polyphagousCheck;
	//체중  0
	private int weight;
	
	/**
	 * 생성자
	 * @param sexagenaryCycle  12간지
	 * @param order  순서
	 * @param percent  생태계 차지 퍼센트
	 * @param polyphagousCheck  잡식 유무
	 * @param weight  체중
	 */
	public Mouse(String sexagenaryCycle, 
				int order, 
				double percent,
				boolean polyphagousCheck,
				int weight) {
		this.sexagenaryCycle = sexagenaryCycle;
		this.order = order;
		this.percent = percent;
		this.polyphagousCheck = polyphagousCheck;
		this.weight = weight; 
		
	}
	
	/**
	 * 간지를 찍어주는 함수
	 * @param beforeSexagenaryCycle 이전 간지 정보
	 */
	public String printSexagenaryCycle(String beforeSexagenaryCycle) {
		System.out.println(beforeSexagenaryCycle+"->"+sexagenaryCycle);
		return sexagenaryCycle;
		
	}
	
	/**
	 * 순서를 찍어주는 함수
	 * @param beforeSexagenaryCycle 이전 순서 정보
	 */
	public int printOrder(int beforeOrder) {
		System.out.println(beforeOrder+"->"+order);
		return order;
		
	}

	public String getSexagenaryCycle() {
		return sexagenaryCycle;
	}

	public void setSexagenaryCycle(String sexagenaryCycle) {
		this.sexagenaryCycle = sexagenaryCycle;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}

	public boolean isPolyphagousCheck() {
		return polyphagousCheck;
	}

	public void setPolyphagousCheck(boolean polyphagousCheck) {
		this.polyphagousCheck = polyphagousCheck;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
