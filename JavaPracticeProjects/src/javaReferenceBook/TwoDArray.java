package javaReferenceBook;

public class TwoDArray {
	public static void main(String args[]){//a multidementional array can be initialized and allocated at the same time, unlike One-Dimensional Arrays
		int twoD[][] = new int[4][5];
		int i, //declared for row number
			j, //declared for column number
			k = 5; //initialized for individual index variables
		
		
		//Two nested for loops allow us to visit and assign a variable to each index in a 2D array
		for(i=0; i<4; i++){			//visits each column
			for(j=0; j<5; j++){		//visits each row
				twoD[i][j] = k;		//initializes each index -- the first number will be 5;
				k++;
			}
		}
		
		//this for loop will display each index in the array
		for(i=0; i<4; i++){ 
			for(j=0; j<5; j++){
				System.out.print(twoD[i][j] + " ");
			}
			System.out.println("");
		}
		
		System.out.println("//////////////////////////////////////////////////////////////////");
		//a multidementional array can be declared and initialized similar to a One-Dimensional Array
		int[][] rowAndColumn = { {0,1,2,3}, 
							  	 {3,2,1,0}, 
							  	 {3,5,6,1}, 
							  	 {3,8,3,4}	};
		
		System.out.println("\nThe index on row THIRD row and SECOND column is: " + rowAndColumn[2][1]);
		
		
	}
}