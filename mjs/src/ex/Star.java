package ex;

public class Star {
//	//생성자 함수
//	public Star() {
//	}
	/**
	* 직삼각형을 프린트하는 함수
	* @param num 직삼각형의 크기
	*/
	public void printTriangle(int num) {
		//num = 6;
		// *
		// **
		// ***
		// ****
		// *****
		// ******

		for (int i = 1; i <= num; i++) {
			//i의 갯수만큼 출력

				for (int j = 0; j < i; j++) {
				System.out.print("*");
				}
				//별을 다찍은 후에 계행
				System.out.println();

			}
		System.out.println();
	}
	
	/**
	* 뒤집힌 직삼각형을 프린트하는 함수
	* @param num 뒤집힌 직삼각형의크기
	*/
	public void printReverseTriangle(int num) {

		// ******
		// *****
		// ****
		// ***
		// **
		// *
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j < num-i; j++) {
				System.out.print("*");
			}
			//별을 다찍은 후에 계행
			System.out.println();
		}
		System.out.println();
	}
	
	/**
	* 직삼각형을 프린트하는 함수
	* @param num 밀린 직삼각형의 크기
	*/
	public void printPushTriangle(int num) {

  //      *
  //     **
  //    ***
  //   ****
  //  *****
  // ******
		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < num-i; j++) {
				System.out.print("$");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			//별을 다찍은 후에 계행
			System.out.println();
		}
		
		System.out.println();
	}
	
	
	/**
	* 직삼각형을 프린트하는 함수
	* @param num 뒤집히고 밀린 직삼각형의 크기
	*/
	public void printReversePushTriangle(int num) {

	  // ******
	  //  *****
	  //   ****
	  //    ***
	  //     **
	  //      *
		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < i-1; j++) {
				System.out.print("$");
			}
			for (int j = 0; j <= num-i; j++) {
				System.out.print("*");
			}
			//별을 다찍은 후에 계행
			System.out.println();
		}
		
		System.out.println();
	}
	
	
	public void printPush2Triangle(int num) {

	//      *
    //     ***
    //    *****
    //   *******
    //  *********
    // ***********
			for (int i = 0; i < num; i++) {
				for (int j = 0; j < num-1-i; j++) {
					System.out.print("$");
				}
				for (int j = 0; j < (i*2)+1; j++) {
					System.out.print("*");
				}
				for (int j = 0; j < num-1-i; j++) {
					System.out.print("$");
				}
				//별을 다찍은 후에 계행
				System.out.println();
			}
			
			System.out.println();
		}
	
	
	public void printReversePush2Triangle(int num) {
		// ***********
	    //  *********
	    //   *******
		//	  *****
	    //     ***
		//      *

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("$");
			}
			for (int j = 0; j < ((num-i)*2)-1; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("$");
			}
			//별을 다찍은 후에 계행
			System.out.println();
		}
		
		System.out.println();
	}
	

}
