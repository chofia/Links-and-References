package javaReferenceBook;

public class ForTest {
	public static void main(String args[]){
		int x,
			y = 20;
		
		for(x = 0; x <= 20; x++){
			System.out.println("\nThis is x: " + x);
			System.out.println("This is y: " + y);
			
			y = y -2;
		}
	}
}
