import java.util.Scanner;
public class numeric {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String array = input.nextLine();
		Boolean result;
		result = array.matches("[0-9]+$");
		if (result == true) {
			System.out.println("You have entered numbers");
		}else {
			System.out.println("You haven't entered numbers");
			}
		}				
	}
