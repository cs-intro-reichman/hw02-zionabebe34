/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		
		int x = Integer.parseInt(args[0]); 
		int count = 1;


		while ( count <= x) {
			if ( (x % count) == 0) {
				System.out.println( count ); 
				
			}
			count ++; 
		}


	}
}
