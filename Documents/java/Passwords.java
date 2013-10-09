import java.util.Scanner;
public class Passwords {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String [] array = new String[4];
		for (int i = 0; i < array.length-1; i++){
			System.out.println("Please enter your password");
			array[i] = input.nextLine();
		}
			System.out.println("Your password has expired please enter your new password");
				array[3] = input.nextLine();
			if ((array[3].equals(array[0])) || (array[3].equals(array[1]) || (array[3].equals(array[2]))))
			{
				System.out.println("Sorry this password has already been used. Please enter another"); 	
			} else 
				System.out.println("Password has been changed");
				
			
	}	
}