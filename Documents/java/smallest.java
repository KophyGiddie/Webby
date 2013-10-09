import java.util.Scanner;
public class smallest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your first number");
		int input1 = input.nextInt();
		System.out.println("Please enter your second number");
		int input2 = input.nextInt();
		System.out.println("Please enter your third number");
		int input3 = input.nextInt();
		int result = 0;

		if ((input1 <= input2) && (input1 <= input3)) {
			result = input1;
		} else if ((input2 <= input1) && (input2 <= input3)){
				result = input2;
		} else if ((input3 <= input1) && (input3 <= input1)){
				result = input3;
		}
			
			
		System.out.println("Hey the smallest number is " + result);
	}
}
	
