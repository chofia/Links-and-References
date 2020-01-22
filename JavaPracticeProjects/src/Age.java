import java.util.Scanner;

public class Age{
	public static void main(String[] args){
		
		int birthDay, //users day of birth
			  birthMonth, //month of birth 1-12
			  birthYear;  //Year of birth
		
		//Scanner object is created to read user input
		Scanner keyboard = new Scanner(System.in);
		
		/////////////collect and store users birthDay
		System.out.println("What is your birth day?"); 
		birthDay = keyboard.nextInt();
		
		//validate birthday to only collect 1-31
		while (birthDay < 1 || birthDay > 31){
			System.out.println("INVALID!! Please input a number between 1 - 31");
			//collect users new input.
			birthDay = keyboard.nextInt();
		}
		
		/////////////collect and store users birthMonth
		System.out.println("What is your birth month?");
		birthMonth = keyboard.nextInt();
		
		//validate birthMonth to only collect 1-12;
		while (birthMonth < 1 || birthMonth > 12){
			System.out.println("INVALID!! Please input a number between 1 - 12");
			//collect users new input.
			birthMonth = keyboard.nextInt();
		}

		/////////////collect and store users birthYear
		System.out.println("What is your birth year?");
		birthYear = keyboard.nextInt();
		
		//validate birthYear so that the person doesn't go under 1700s or over 2100
		while (birthYear < 1700 || birthYear > 2100){
			System.out.println("INVALID INPUT!! Please iput a number between 1700 - 2100");
			birthYear = keyboard.nextInt();
		}
		
		//display results
		System.out.println(birthDay);
		System.out.println(birthMonth);
		System.out.println(birthYear);
	}
}
