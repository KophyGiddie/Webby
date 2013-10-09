import java.util.Scanner;
public class hexa {

    public static void main(String args[]) {

        System.out.println("Please enter Hexadecimal number : ");
        Scanner scanner = new Scanner(System.in);
      
        String hexadecimal = scanner.nextLine();

        int decimal = Integer.parseInt(hexadecimal, 16);
      
        System.out.println("Converted Decimal number is : " + decimal);
      
        String binary = Integer.toBinaryString(decimal);
        System.out.println("The hexadecimal to Binary conversion of " + hexadecimal + "is" + binary );
    }
}