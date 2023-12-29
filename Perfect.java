/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int num = Integer.parseInt(args[0]); 
		String divisors = ""; 
		int div = 0; 
		String newDiv = ""; 

		for  (int i = 1; i < num; i++) {
			if ( (num % i) == 0) {
				div = div + i; 
				String temp = String.valueOf( i ); // change the value to string 
				divisors += temp + " " + "+" + " "; 
			}
		}

		for (int k = 0; k < divisors.length() - 2; k++ ) {
			newDiv = newDiv + divisors.charAt(k); //storage the divisors without the plus that supposed to be in the end of the string" 

		}





		if (div == num) {
			System.out.println( num + " " + "is a perfect number since" + " " + num  + " = "+ "" + newDiv); 
		} else {
			System.out.println( num + " " + "is not a perfect number");
		}

	

	}
}
