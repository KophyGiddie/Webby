import java.util.Scanner;
public class array3 {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int [] array = new int[10];
	System.out.println("Please input your number");
	array[0] = in.nextInt();
	int maxnumber = array[0];
	int minnumber = array[0];

		for (int i = 1; i < array.length; i++)
			{
	     System.out.println("Please input your number");
	           array[i] = in.nextInt();                   
				if (array[i] > maxnumber ) {
					maxnumber = array[i];
					}
				if (array[i] < minnumber){
					minnumber = array[i];
				}
 
			}
		System.out.println("Your maximum number is " + maxnumber);
		System.out.println("Your minimum number is " + minnumber);
		}
	}
	