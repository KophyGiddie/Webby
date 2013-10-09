import java.util.Scanner;
public class sch {
	
	public static void main(String[] args) {
		java.util.Scanner input = new Scanner(System.in);
		System.out.println("Please enter a Your First Name");
		String result = input.nextLine();
		System.out.println("Please enter a Your Last Name");
		String result1 = input.nextLine();
		String result2 = result1.substring(0,1) + result.substring(1);
		String result3 = result.substring(0,1) + result1.substring(1);
		System.out.println(result2 + " " + result3);
	}
}