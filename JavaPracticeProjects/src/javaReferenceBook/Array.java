package javaReferenceBook;

public class Array {
	public static void main(String args[]){
		int month_days[]; //variable is declared
		
		month_days = new int[12]; //memory is being dynamically allocated 
		
	
		month_days[0] = 31; //index starts at 0 for all Arrays
		month_days[1] = 28;
		month_days[2] = 31;
		month_days[3] = 30;
		month_days[4] = 31;
		month_days[5] = 30;
		month_days[6] = 31;
		month_days[7] = 31;
		month_days[8] = 30;
		month_days[9] = 31;
		month_days[10] = 30;
		month_days[11] = 31;
		
		// display an array 
		
		System.out.println("April has " + month_days[3] + " days.");
		
		// 'new' is not needed when an array is declared and initialized
		int another_array[] = {1, 3, 4, 12, 8, 2};
		
		System.out.println("The third index is : " + another_array[2]); //4 will display
	}
}
