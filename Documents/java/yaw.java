import javax.swing.JOptionPane;
public class yaw {
	public static void main(String[] args) {
		int number = Integer.parseInt(JOptionPane.showInputDialog("Please enter your number"));
        String binary = Integer.toBinaryString(number);;
		System.out.println(binary);
		System.exit(0);
	}
}