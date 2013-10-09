import java.util.Scanner;
public class withoutString 
{
	public static void main(String[] args) throws Exception
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your main word");
		String base = input.nextLine();
		System.out.println("Please enter the letter or word you want deleted");
		String remove =input.nextLine();

		StringBuffer strBuf = new StringBuffer();
		strBuf.append(base);

		if(remove.length() > 1) {
		strBuf.replace(strBuf.indexOf(remove),strBuf.indexOf(remove)+remove.length(), "");
		} else {
		for (int i=0; i < strBuf.indexOf(remove);i++ ) {
				strBuf.delete(strBuf.indexOf(remove), strBuf.indexOf(remove)+1);
		}
		}
		System.out.println(strBuf);

	}
}