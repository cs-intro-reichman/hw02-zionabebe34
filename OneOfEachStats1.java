/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]); 
		double sumChild = 0; // sum of all the children for the compute the average 
		
		int twoChild = 0; 
		int threeChild = 0; 
		int fourorMore = 0; 
		

		for (int i = 0; i < T; i++) {

			//define the first child and add for the count
			int num1 = (int) (Math.random() * 2) + 1; 
		    int countChild = 1; 

			while (true) {
				int num2 = (int) (Math.random() * 2) + 1; 

				if (num1 == num2 ) {
				 	countChild++;
				 	num1 = num2;  
				} else if  (num1 != num2 ) {
				 	countChild++;
				 	break; 
				}

			}

			if ( countChild == 2 ) {
				twoChild++; 
			} else if ( countChild == 3 ) {
				threeChild++; 
			} else if ( countChild >=4 ) {
				fourorMore++; 
			}


			sumChild += countChild; 
		}
		S

		double average = (double) (sumChild / T); 
		System.out.println("Average:" + " " + ( average ) + " " + "children to get at least one of each gender." );
		System.out.println( "Number of families with 2 children:" + " " + twoChild); 
		System.out.println( "Number of families with 3 children:" + " " + threeChild);
		System.out.println( "Number of families with 4 children:" + " " + fourorMore);  
			
		

		 
	
	
		
		
	}
}
