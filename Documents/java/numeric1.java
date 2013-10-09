import java.util.Scanner;
public class numeric1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String array = input.nextLine();
		Boolean result;
		result = array.matches("[a-zA-Z]{8,}");
		if (result == true) {
			System.out.println("You have entered at least 8 alphabets");
		}else {
			System.out.println("error");
			}
		}	
		
	}
