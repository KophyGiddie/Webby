import java.util.Scanner;
public class leapyear {
	public static void main(String[] args) {
		boolean value = isleapyear();
		printer(value);
	}


	static void printer (boolean value) {
		if (value == true){
			System.out.println("year entered is a leap year");
		}else {
			System.out.println("year entered is not leap year");
		}
	}
	static boolean isleapyear (){
		boolean value = false;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a year");
		int year = input.nextInt();
		if ((year%4==0) && (year%100 != 0))
				value = true;
		else if ((year%4==0) && (year%100 == 0) && (year%400 == 0))
				value = true;
		else {
				value = false;
		}
		return value;
	}

					
	}
