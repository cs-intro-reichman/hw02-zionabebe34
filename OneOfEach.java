
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		int num1 = (int) (Math.random() * 2) + 1; 
		String child = ( num1 >= 2 )?( "g" ):( "b" );  // 2 for girl 1 for boy  
		String res = "";
		res = res + child; // put the first child in the string   
		int num2; 
		int count = 1; //count the number of children in the family , 1 aleardy counted

		while ( true ) { 
			num2 = (int) (Math.random() * 2) + 1; 
			String child2 = ( num2 >= 2 )?( "g" ):( "b" );
			count++; 

			if ( num1 == num2 ) {
				 res = res + child2; 
			} else if (num1 != num2 ) {
				res = res + child2; 
				break; 
			}

		}
		System.out.println(res);
		System.out.println("You made it... and you now have" + " " + count + " " + "children.");

	 
	}

} 
	 



