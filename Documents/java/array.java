public class array {
	
	public static void main(String[] args) {
			String [] myarray = {"Mon","Tue", "Weds", "four"};
			for (int i = 0; i < myarray.length; i++){
				System.out.print(" " + myarray[i] + ", ");
				}
			System.out.println();
			String [] myarray2 = new String [4];
			int num=myarray.length-1;
				for (int i = 0; i < myarray.length; i++){
					myarray2[i] = myarray[num];
					num=num-1;
				System.out.print(" " + myarray2[i] + ", ");
				}
				System.out.println();
				
	}
}