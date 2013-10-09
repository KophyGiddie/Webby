import java.util.Scanner;
public class maxnumber {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int maxnumber = 0;
	int input = in.nextInt();
	int minnumber = input;
	if (input == -1){
		System.out.println("Max number not applicable");
		}
	else if (input != -1){
		while (input != -1 )
			{
			
			int am = input;                               
				if (input > maxnumber ) {
					maxnumber = input ;
					}
				if (input < minnumber){
					minnumber = input;
				}
				input = in.nextInt(); 
			}
		System.out.println("Your maximum number is " + maxnumber);
		System.out.println("Your minimum number is " + minnumber);
		}
	
	}
	}

