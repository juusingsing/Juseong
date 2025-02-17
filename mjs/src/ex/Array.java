package ex;

public class Array {
	public int[][] setNumber() {
		int[][] intArray = new int[10][20];
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				intArray[i][j] = j+(20*i);
				
			}
			
		}
		return intArray;
	}

}
