package javaReferenceBook;

public class Scope {
	public static void main(String args[]){
		int x; //known to all code within scope
		
		x = 10;
		if(x == 10){ //start of new scope
			int y = 20; //known only to this block
			
			//x and y are both known here
			System.out.println("x and y: " + x + " " + y);
			x = y *2; //40
		}//end of if statement
		
		//y = 100; // Error! y is not known here
		
		//x is still known here
		System.out.println("x is: " + x);
	}
}