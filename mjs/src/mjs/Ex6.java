package mjs;
import ex.Array;
public class Ex6 {

	public static void main(String[] args) {
		
		Array a = new Array();
		int[][] array = a.setNumber();
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println("array["+i+"]["+j+"] : " + array[i][j]);
			}
		}
	}

}

