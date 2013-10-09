import java.util.Scanner;
public class pie {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();

		double output = 0.0;
		boolean positive = true;
		for (int i=0; i<input; i++) { 
		    double addup = 1.0/(2.0*((double)i) + 1.0);
	   		if (positive) 
	      	{output += addup;}
	   		else 
	      	{
	      		output -= addup;	
	   		}
	   		positive = !positive;
		}
		System.out.println("Pi is " + output*4.0);
	   }
 }
