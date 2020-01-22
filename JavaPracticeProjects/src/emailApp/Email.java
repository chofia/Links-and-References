package emailApp;

import java.util.Scanner;

/**
 *  Generate an email with the following syntax: firstname.lastname@department.company.com
    Determine the department (sales, development, accounting), if none leave blank
    Generate a random String for a password
    Have set methods to change the password, set the mailbox capacity, and define an alternate
	email address
    Have get methods to display the name, email, and mailbox capacity
 */

public class Email {
	private String firstName, 
				   lastName, 
				   department,
				   password, 
				   email,
				   alternateEmail;
	
	private int defaultPasswordLength = 8,
				mailboxCapacity = 500;
	
	
	//Constructor to receive the first name and last name for email
	public Email(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		

		System.out.println("New Employee: " + firstName + " " + lastName);
		
		//Call a method asking for the department - return the department
		this.department = setDepartment();
		
		//Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		
		//IF statement used to generate proper email format
		if (this.department == "NA"){
			email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@company.com";
		} 
		else {
			email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + ".company.com";
		}
	}//Email method end
	
	//Ask for the department
	private String setDepartment(){
		System.out.println("DEPARTMENT NUMBERS  \n1 for Sales \n2 for Development \n3 for Accounting \n0 for None \nEnter Department Number: ");
		
		Scanner input = new Scanner(System.in);
		int depChoice = input.nextInt();
		
		//validate user input
		while (depChoice < 0 || depChoice > 3){
			System.out.println("INVALID INPUT!! \nPlease try again" 
					+ "\nEnter the department \n1 for Sales \n2 for Development \n3 for Accounting \n0 for None");
			
			depChoice = input.nextInt();
		}
		
		//give department chosen a  variable to return.
		if (depChoice == 1) {
			return "Sales";
		}
		else if (depChoice == 2) {
			return "Development";
		}
		else if (depChoice == 3){
			return "Accounting";
		}
		else {
			return "NA";
		}
		
	}//setDepartment method end
	
	//Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuv0123456789!@#$";  //defines choices and possibilities
		
		char[] password = new char[length]; //create character array
		
		//for loop to generate random characters 
		for (int i = 0; i < length; i++) {
			int random = (int) (Math.random() * passwordSet.length() );
			password[i] = passwordSet.charAt(random);
		}
		
		return new String(password);
	}//randomPassword End

//	Set methods to define some properties
	//Set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	//Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	//Change the password
	public void changePassword(String password){
		this.password = password;
	}
	
//	Get methods to retrieve information
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	public String getAlternateEmail(){
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	// display the name, email, and mailbox capacity
	public String displayEmployeeInfo(){
		return "Employee Name: " + firstName + " " + lastName +
				"\nCompany Email: " + email +
				"\nTemporary password: " + this.password +
				"\nMailbox Capacity: " + mailboxCapacity + "mb";
	}

}
























