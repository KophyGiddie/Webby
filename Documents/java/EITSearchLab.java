import java.io.*;
import java.util.Scanner;

public class EITSearchLab {
	public static void main(String[] args) throws IOException{
		//read and store user records
		final String EIT_FILE = "EIT.csv";	//feel free to add your name to the file!
		String [] EIT_records = readFile(EIT_FILE);

		//ask user for email and password
		String message = "Please enter the first name of a 2014 or 2015 EIT: ";
		String name = askForString(message);
		message = "Please enter the year of that EIT: ";
		String year = askForString(message);

		//check if email and password combination are correct
		String result = checkEITYear(EIT_records, name, year);

		printResult(result);
	}

	//reads any .csv file and returns an array of records (file must be semi-colon separated and no end-line characters)
	static String [] readFile (String filename)	throws IOException {
		//***** TASK 1 *****
		//make a new File object with the file name passed to this method
		File infile = new File(filename);
		//make a new Scanner object with the file object as its argument
		Scanner lineScanner = new Scanner(infile);
		String content = "";
		//set up a loop to continue until all the records are captured from the file
		while (lineScanner.hasNextLine()){
			content = lineScanner.nextLine();
		}
			//store all the records into a string
		String [] contentArray = content.split(";");
			//separate all the records into an array of individual records by using the .split() method (each record is separated by a semi colon)
		
		//return the array of individual records
		return contentArray;
	}

	static String checkEITYear(String [] EIT_records, String name, String year) {
		//***** TASK 2 *****
		//loop through all the records in the EIT_records array
			//separate each item of an EIT record into an array using the .split() method (remember, items are separated by commas)
		String result = "";
		String [] nameYear = new String[2];
		for (int i = 0; i < EIT_records.length; i++ ) {
				nameYear = EIT_records[i].split(",");
			//check to see if the name in that record matches the name provided by the user
			//check to see if the year associated with that name matches the year provided by the user
 
				if ( (name.equals(nameYear[0]) && year.equals(nameYear[1])) )
				{
					result = "TRUE";
					break;
				} else {
					result = "FALSE";
					
				}
			}
			return result;
	}
	
			
			//save the appropriate messages to a string called "result" for the following cases:

						//if the name and the year match
						//if the name matches and the year does not
						//if neither the name or the year match

		//return a String value of TRUE if the the name and year matched or FALSE if the the year did not match or the EIT was not found
	

	static void printResult (String result) throws IOException {
		//***** TASK 3 *****
		//create File object called "outFile" for your output file
		File outFile = new File("out.txt");
				//create PrintWriter object called "out" to write to your output file
		PrintWriter out = new PrintWriter(outFile);
		//write your result from your checkEITYear method to the file
		out.write(result);
		//close the PrintWriter file
		out.close();
	}

	static String askForString (String message) throws IOException{
		System.out.print(message);
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		String response = keyboard.readLine();
		return response;
	}
}