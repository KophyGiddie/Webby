import javax.swing.JOptionPane;
public class hexadecimal {
	public static void main(String[] args) {
		int number = Integer.parseInt(JOptionPane.showInputDialog("Please enter your number"));
		int remainder = 0;
		String am = "";
		while (number > 0){
			remainder = number%16;
			am = am + remainder;
			number = number/16;
		}
		System.out.println(am);
		System.exit(0);
	}
}