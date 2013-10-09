import java.util.Scanner;
public class sch {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		String result = input.nextLine();
		String new_result = substring.result(result.length()-1) + substring.result(1,result.length()-2) + substring.result(0,1);
		System.out.println(result);
	}
}