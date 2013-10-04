import java.util.Scanner;
import java.io.*;
public class ZerplyAssignment_Template 
{
	public static void main(String[] args) throws Exception 
	{
		final String USER_FILE = "user.csv";
		final String PROFILE_FILE = "info.csv";
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome. Are you a new user? (y/n):");
		String received = input.nextLine();
		if(received =="y") 
		{
			String [] arrayInput = readInputFile(USER_FILE);

			System.out.println("Please enter your first name:");
			String firstName = input.nextLine();
			firstName = validateName(firstName);
			System.out.println("Please enter your last name:");
			String lastName= input.nextLine();
			lastName = validateName(lastName);
			System.out.println("Please enter your email address:");
			String email = input.nextLine();
			email = validateEmail(email);
			if (checkExistingUser(email, arrayInput)) 
				do 
					{
						System.out.println("This email has been already used by someone please enter a new email");
						email = input.nextLine();
						email = validateEmail(email);
					}
				while(checkExistingUser(email, arrayInput));
			System.out.println("Please enter your password:");
			String password1 = input.nextLine();
			System.out.println("Please confirm your password:");
			String password2 = input.nextLine();
			boolean receive = validatePassword(password1, password2);
			while(!validatePassword(password1, password2))
			{
				System.out.println("Your passwords do not match please enter again");
				System.out.println("Please enter your password:");
				password1 = input.nextLine();
				System.out.println("Please confirm your password:");
				password2 = input.nextLine();
			}
			String result ="";
			result = storeUser(email, password1, firstName, lastName);
			outputInfo(result, USER_FILE);
			String profileInfo = email + "," + storeUserInfo ();
			outputInfo(profileInfo, PROFILE_FILE);
		}
		
		else if (received=="n") 
		{
			String [] arrayInput = readInputFile(USER_FILE);
			System.out.println("Please enter your email:");
			String email = input.nextLine();
			email = validateEmail(email);
			System.out.println("Please enter your password:");
			String password = input.nextLine();
			
				if (userLogIn(email, password, arrayInput)) 
				{
					printUserProfile(PROFILE_FILE, email);
				}
		}

	}

	//this method reads existing data from user information and users files
	static String [] readInputFile (String filename) throws IOException 
	{ 
		String [] records = new String [10];
		File infile = new File(filename);
		Scanner lineScanner = new Scanner(infile);
		String content = "";
		while (lineScanner.hasNextLine()){
			content = lineScanner.nextLine();
		}
		records = content.split(",");
		return records;
	}

	//this method checks to see if the user logging in exists in the input file already (make sure you check for cases where users.csv is empty!)
	static boolean checkExistingUser (String email, String [] userInfo) 
	{ 
		boolean result=false;
		for (int i = 0; i < userInfo.length; i++ ) {
				if (email.equals(userInfo[i]))
				{
					result = true;
					break;
				} else {
					result = false;	
				}
			}
			return result;
	}

	//this method takes user input for new users and stores it in a comma separated String
	static String storeUser (String email, String password, String firstName,  String lastName) 
	{ 
		result = email + "," + BCrypt.hashpw(password, BCrypt.gensalt()) + "," + firstName + "," + lastName+ ",";
	}
	//this method writes a String with user info to the users.csv or info.csv (make sure you don’t overwrite your info!)
	static void outputInfo (String record, String fileName) throws Exception
	{
		FileWriter outFile = new FileWriter(fileName,true);
		PrintWriter out = new PrintWriter(new BufferedWriter(outFile));
		out.write(record);
		out.close();
	}

	//this method takes user provided email, password, and user info and checks it against the data from the user.csv file
	static boolean userLogIn (String email, String password, String [] userInfo) 
	{ 
			boolean result = false;
			for (int i = 0; i < userInfo.length; i++ ) 
			{
				if (  (email.equals(userInfo[0])) && (BCrypt.checkpw(password, userInfo[1])) )
				{
					result = true;
					break;
				} else {
					result = false;	
				}
			}
			return result;
	}
		
	
	//this method takes a user provided email and the info.csv file object, pulls the profile info of the user with the provided email
	static void printUserProfile (String fileName, String email) throws Exception{
		String [] array = readInputFile(fileName);
		for (int i = 0; i < array.length; i++) {
				if (email.equals(array[i]))
				{
					System.out.println("You are logged in.");
					System.out.print("Twitter:");
					System.out.println(array[i+1]);
					System.out.print("Github:");
					System.out.println(array[i+2]);
					System.out.print("Website:");
					System.out.println(array[i+3]);
					System.out.print("University:");
					System.out.println(array[i+4]);
					System.out.print("Major:");
					System.out.println(array[i+5]);
					System.out.print("Company:");
					System.out.println(array[i+6]);
					System.out.print("Title:");
					System.out.println(array[i+7]);
					System.out.print("Telephone Number:");
					System.out.println(array[i+8]);
					break;
				} else {
					continue;	
				}
			}		
	}

	//this method asks the user for profile info and then stores it in a comma separated String
	static String storeUserInfo () 
	{ 

		Scanner input = new Scanner(System.in);
		System.out.println("ACCOUNT CREATED SUCCESSFULLY");
		System.out.println("Please enter your Twitter handle:");
		String twitter = input.nextLine();
		while(!validateAlphaNum(twitter))
			{
				System.out.println("Your twitter name is invalid please enter again");
				twitter = input.nextLine();
			}
		System.out.println("Please enter your Github username:");
		String github = input.nextLine();
		while(!validateAlphaNum(github))
			{
				System.out.println("Your Github name is invalid please enter again");
				github = input.nextLine();
			}
		System.out.println("Please enter your website address:");
		String website = input.nextLine();
		while(!validateWebsite(website))
			{
				System.out.println("Your website has been entered in an invalid format please enter again");
				website = input.nextLine();
			}
		System.out.println("Please enter the name of your University:");
		String university = input.nextLine();
		while(!validateAlphaNumSpace(university))
			{
				System.out.println("You must enter a valid university name. Please enter again");
				university = input.nextLine();
			}
		System.out.println("Please enter your major:");
		String major = input.nextLine();
		while(!validateAlphaNumSpace(major))
			{
				System.out.println("You must enter a valid major name. Please enter again");
				major = input.nextLine();
			}
		System.out.println("Please enter your company name:");
		String company = input.nextLine();
		while(!validateAlphaNumSpace(company))
			{
				System.out.println("You must enter a valid Company name. Please enter again");
				company = input.nextLine();
			}
		System.out.println("Please enter your title:");
		String title = input.nextLine();
		while(!validateAlphaNumSpace(title))
			{
				System.out.println("You must enter a valid university name. Please enter again");
				title = input.nextLine();
			}
		System.out.println("Please enter your phone number (format ###-###-####):");
		String number = input.nextLine();
		while(!validatePhoneNumber(number))
			{
				System.out.println("You must enter a valid phone number. The format should be ###-###-####");
				number = input.nextLine();
			}
		System.out.println("Thank you. Your input has been recorded");
		String result = "";
		result = twitter + "," + github + "," + website + "," + university+ "," + major+ "," + company+ "," + title+ "," + number+ ",";
		return result;
	}

	// *** HELPER METHODS ***

//validate a phone number
 static boolean validatePhoneNumber(String input) 
 { 
		if (input.matches("[0-9]{3}-[0-9]{3}-[0-9]{4}")) {
			return true;
		} else {
			return false;
		}
}
	//this method checks if the two user entered passwords are the same
	static boolean validatePassword (String password1, String password2) 
	{ 
		if (password1.equals(password2)){
			return true;
		}
		else
		{	
			return false;
		}
		
	}
// This validates FirstName and LastName
	static String validateName (String name) 
	{ 
		Scanner input = new Scanner(System.in);
		if (name.matches("[a-zA-Z]+"))
		{
			return name;
		}
		else
		{
			do 
			{
				System.out.println("Please enter a valid name:");
				name = input.nextLine();
			}
			while (!name.matches("[a-zA-Z]+"));
				return name;
		}
	}

	// This validates email
	static String validateEmail (String email) 
	{ 
		Scanner input = new Scanner(System.in);
		if (email.matches("[a-zA-Z0-9_]+@[a-z0-9A-Z]+.[a-z]{2,3}"))
		{
			return email;
		}
		else
		{
			do 
			{
				System.out.println("Please enter a valid email:");
				email = input.nextLine();
			}
			while (!email.matches("[a-zA-Z0-9_]+@[a-z0-9A-Z]+.[a-z]{2,3}"));
				return email;
		}
	}

//use this method to validate twitter and github
static boolean validateAlphaNum(String input) 
{ 
		if (input.matches("[a-zA-Z0-9]+")) {
			return true;
		} else {
			return false;
		}
}
// Validation of university, major, company, and title
static boolean validateAlphaNumSpace(String input) 
{ 
		if (input.matches("[a-zA-Z0-9 ]+")) {
			return true;
		} else {
			return false;
		}
}


// Website Validation www.[lower alpha/num/.].[2 or 3 lower alpha]
 static boolean validateWebsite(String input) 
{ 
		if (input.matches("www.[a-z0-9]+.[a-z]{2,3}")) {
			return true;
		} else {
			return false;
		}
}


}