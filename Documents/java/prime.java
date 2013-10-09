public class prime {
	public static void main(String[] args) {
        int max = 50;
	 

	 
	        
	        for (int i = 1; i<max; i++) {
	 
	            boolean isPrimeNumber = true;
	 
	            
	            for (int j = 2; j < i; j++) {
	                if (i % j == 0) {
	                    isPrimeNumber = false;
	                    
	                }
	            }

	            if (isPrimeNumber == true) {
	                System.out.println(i + " ");
	            }
	        }
	 
	    }
	 
	}


