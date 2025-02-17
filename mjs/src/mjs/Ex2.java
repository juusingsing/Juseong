package mjs;

public class Ex2 {

	public static void main(String[] args) {
		String[] oStr = {"a", "b","c"};
		String[] nStr = new String[5];
		System.arraycopy(oStr, 0, nStr, 0, oStr.length);
		//     복사할변수, 복사할변수 시작점, 저장할변수, 저장할변수 시작점, 복사할갯수
		
		for(int i=0; i<nStr.length;i++) {
			System.out.println("nStr"+(i+1)+" : "+ nStr[i]);
		
		}

	}

}
