package com.Array;



public class ArrayMulti {

	public static void main(String[] args) {


		int[][]array = new int[5][5];
		
		for (int i = 0; i<array.length; i++) {
		for	(int j=0;j<array[i].length;j++){
				
				array[i][j]= i+j;
			
		}
		}
		
		for (int i = 0; i<array.length; i++) {
			for	(int j=0;j<array[i].length;j++){
			
			
			System.out.println(array[i][j]);
	}

}

		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		for (int i = 0; i < myNumbers.length; ++i) {
			for(int j = 0; j < myNumbers[i].length; ++j) {
				System.out.println(myNumbers[i][j]);
			}
		}



	}
}
