/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]); 
		int count = 0;
		int counter = 0;


		for (int i = 1; i <= (num * num ); i++) {
			System.out.print(" *"); //print the pattern 
			if ( i % num == 0) {
				System.out.print(" ");
				System.out.println(); //down the line 

			if (count == counter){ // after we down the line its check if the line need to move right
				System.out.print(" ");
				counter = counter + 2;  // the counts help us to sure the progam will move right every two lines 
			}
				 
			count++;

			}
			 
		}

	}
}
