package mjs;
import ex.Bird2;
import ex.Bird;

public class Ex13 {

	public static void main(String[] args) {
		Bird2 st = new Bird2("참새", "색깔", "작음", "귀여움");
		System.out.println(st.Birdprint());
		System.out.println("st:"+st);
		Bird b = st;
		System.out.println("b:"+b);
		//부모가아는것 + 오버라이딩 한것만 사용가능 > 내가 상속한것만 사용가능
		b.getColor();
		//오버라이딩 한것만
		b.eat();
		
		
		st.eat();   // 부모 자식클래스간만 가능     동일한 범위 or 더 큰 범위로 자식클래스에서 재정의가능
	}				// final class 는 부모클래스가 될수가없음. 자식클래스를 가지지못함.
					// final 을 메소드에 적용시키면 그 메소드는 자식클래스에서도 사용하지못함.
}