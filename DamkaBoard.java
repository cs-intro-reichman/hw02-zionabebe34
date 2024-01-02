/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]); 

	
		for ( int i = 0; i < num; i++) { 
			for ( int k = 0; k < num; k++)
				if ( i % 2 != 0 ) {
				    System.out.print(" x"); 
				} else {
					System.out.print("x "); 
				}
				System.out.println();
			
		}

	}
}
