import java.util.Scanner;
import java.io.*;
public class project1 {
	public static void main(String[] args) {
		
	}

	//this method reads existing data from user information files
	static String [] readInputFile (String filename) throws Exception
	{ 
		File infile = new File(filename);
		Scanner lineScanner = new Scanner(infile);
		String content = "";
		while (lineScanner.hasNextLine()){
			content = lineScanner.nextLine();
		}
		String [] records = new String [5]; 
		records = content.split(",");
	return records; 
	}

	//this method checks to see if the user logging in exists in the input file already
	static boolean checkExistingUser (String email) 
	{ 
		return true; 
	}

	//this method checks if the two user entered emails are the same
	static boolean validateEmail (String email) 
	{ 
		return true; 
	}

	//this method takes user input for new users and stores it in a comma separated String
	static String storeUser (String email, String password, String firstName,  String lastName) 
	{ 
		String result =""; 
		result = email + "," + password + "," + firstName + "," + lastName;
		return result; 
	}

	//this method writes a String with user info to the users.csv or info.csv (make sure you don’t overwrite your info!)
	static void outputInfo (String record, String filename) 
	{

	}

	//this method takes user provided email and password and checks it against the data from the user.csv file
	static boolean userLogIn (String email, String password) 
	{ 
		return true; 
	}

	//this method takes a user provided email and the info.csv file object, pulls the profile info of the user with the provided email
	static void printUserProfile (String filename,  String email) 
	{
		System.out.println("You are logged in.");
		System.out.println("Twitter:");
		System.out.println("Github:");
		System.out.println("Website:");
		System.out.println("University:");
		System.out.println("Major:");
		System.out.println("Company:");
		System.out.println("Title:");
		System.out.println("Telephone:");
	}

	//this method asks the user for profile info and then stores it in a comma separated String
	static String  storeUserInfo (String message) 
	{ 
		String result ="" ;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your Twitter handle:");
		System.out.println("Please enter your Github username:");
		System.out.println("Please enter your website address:");
		System.out.println("Please enter the name of your University:");
		System.out.println("Please enter your major:");
		System.out.println("Please enter your company name:");
		System.out.println("Please enter your title:");
		System.out.println("Please enter your phone number<10 digits>:");
		return result;
	}
}