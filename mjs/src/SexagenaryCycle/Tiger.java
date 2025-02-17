package SexagenaryCycle;
//쥐 클래스
public class Tiger {
	//12간지  문자형
	private String sexagenaryCycle;
	//순서    정수형
	private int order;
	//생태계차지퍼센트   실수형
	private double percent;
	//잡식유무  논리형
	private boolean polyphagousCheck;
	//멸종유무
	private boolean extinctionCheck;
	
	/**
	 * 생성자
	 * @param sexagenaryCycle  12간지
	 * @param order  순서
	 * @param percent  생태계 차지 퍼센트
	 * @param polyphagousCheck  잡식 유무
	 * @param extinction  체중
	 */
	public Tiger(String sexagenaryCycle, 
				int order, 
				double percent,
				boolean polyphagousCheck,
				boolean extinctionCheck) {
		this.sexagenaryCycle = sexagenaryCycle;
		this.order = order;
		this.percent = percent;
		this.polyphagousCheck = polyphagousCheck;
		this.extinctionCheck = extinctionCheck; 
		
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

	public boolean isExtinctionCheck() {
		return extinctionCheck;
	}

	public void setExtinctionCheck(boolean extinctionCheck) {
		this.extinctionCheck = extinctionCheck;
	}
	
	
}
