package ex;

public enum Week {
	//월요일 관련 정보
	Mon("월요일","01"),
	Tue("화요일","02"),
	Wed("수요일","03"),
	Thu("목요일","04"),
	Fri("금요일","05"),
	Sat("토요일","06"),
	Sun("일요일","07");

	private String label;
	private String code;

		private Week(String label, String code) {
			this.label = label;
			this.code = code;
		}
		
		public String getLabel() {
			return label;
		}
		
		public String getCode() {
			return code;
		}
}