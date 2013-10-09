import java.util.Scanner;
public class numeric3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String array = input.nextLine();
		Boolean result;
		result = array.matches("[a-z0-9]*@[a-z0-9]*.[a-z]{2,3}");
		if (result == true) {
			System.out.println("It is a valid email address");
		}else {
			System.out.println("It is not a valid email");
			}
		}	
		
	}
