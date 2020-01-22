package javaReferenceBook;

public class IfSample {
	public static void main(String args[]){
		int x = 10,
			y = 20;
		
		if(x < y){
			System.out.println("x is less than y");
		}
		
		x = x*2;
		if(x==y){
			System.out.println("x is now equal to y");
		}
		
		x = x*2;
		if(x > y){
			System.out.println("x is now greater than y");
		}
		
		// this is just a practice comment i guess.
		if(x == y){
			System.out.println("you won't see this.");
		}
	}
}