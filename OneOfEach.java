
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		int num1 = (int) (Math.random() * 2) - 1; 
		String child = ( num1 == 2)?( "g" ):( "b" ); 
		String res;  
		res = res + child; 
		int num2; 

		while (true) {
			num2 = (int) (Math.random() * 2) - 1; 
			String newChild = (num2 == 2)?( "g" ):( "b" ); 
			res = res + newChild; 
			if ( num1 != num2 ){
				break; 
			} 
		}
		System.out.println(res);
	 
	}

} 
	 



