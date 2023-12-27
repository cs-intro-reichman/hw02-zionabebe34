/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		String str = " "; 
		int num = (int)( (Math.random() * 10) + 1 );
		str = "" + num;  
		

		while (true) {
			int num1 = (int) ( (Math.random() * 10) + 1 ); 
			if ( num1 > num ) {
				String temp = "" + num1; //storage in temp variable for adding later to str
				str = str + " " + temp; 
				num = num1;
			} else {
				break; 
			}
		}
		System.out.println(str); 

	}
}
