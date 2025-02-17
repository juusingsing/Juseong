package ex;

public class Star2 {
	
	public void printPush2Triangle(int num, int num2, int cut) {

	//      *
    //     ***
    //    *****
    //   *******
    //  *********
    // ***********
			for (int i = 0; i < num-cut; i++) {
				for (int j = 0; j < num2; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < num-1-i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < (i*2)+1; j++) {
					System.out.print("*");
				}
				for (int j = 0; j < num-1-i; j++) {
					System.out.print(" ");
				}
				//별을 다찍은 후에 계행
				System.out.println();
			}
		}
	
	
	public void printReversePush2Triangle(int num, int num2, int cut) {
		// ***********
	    //  *********
	    //   *******
		//	  *****
	    //     ***
		//      *

		for (int i = 0; i < num-cut; i++) {
			for (int j = 0; j < num2; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < ((num-i)*2)-1; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			//별을 다찍은 후에 계행
			System.out.println();
		}
		
	}
	
	public void printPush22Triangle(int num, int num2, int cut) {

		//      *
	    //     ***
	    //    *****
	    //   *******
	    //  *********
	    // ***********
				for (int i = 0; i < num-cut; i++) {
					for (int j = 0; j < num2; j++) {
						System.out.print(" ");
					}
					for (int j = 0; j < num-1-i-cut; j++) {
						System.out.print(" ");
					}
					for (int j = 0; j < ((i+cut)*2)+1; j++) {
						System.out.print("*");
					}
					for (int j = 0; j < num-1-i-cut; j++) {
						System.out.print(" ");
					}
					//별을 다찍은 후에 계행
					System.out.println();
				}
				
		}
	
	public void printReversePush22Triangle(int num, int num2, int cut) {
		// ***********
	    //  *********
	    //   *******
		//	  *****
	    //     ***
		//      *

		for (int i = 0; i < num-cut; i++) {
			for (int j = 0; j < num2; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < num+2-cut+i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < ((num-(i+cut))*2)-1; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < num+2-cut+i; j++) {
				System.out.print(" ");
			}
			//별을 다찍은 후에 계행
			System.out.println();
		}
		
		System.out.println();
	}
	
	public void printStar(int num, int num2, int cut) {
		printPush2Triangle(num, num2, cut);
		printReversePush2Triangle(num, num2, cut);
		printPush22Triangle(num, num2, cut);
		printReversePush22Triangle(num, num2, cut);
	}
	

}
