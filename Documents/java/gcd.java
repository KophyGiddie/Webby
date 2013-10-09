import java.util.Scanner;
public class gcd {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your first number");
		int input1 = in.nextInt();
		System.out.println("Please enter your second number");
		int input2 = in.nextInt();
		System.out.println("The Greatest Common Divisor is " + egcd(input1, input2));
	}
	static int egcd(int a, int b) {
	    if (a == 0)
	        return b;

	    while (b != 0) {
	        if (a > b)
	            a = a - b;
	        else
	            b = b - a;
	    }

	    return a;
	}
}