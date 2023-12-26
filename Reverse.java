/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String s = args[0]; 
		int count = s.length() - 1;

		while (count >= 0) {
			System.out.print(s.charAt(count)); 
			count--;
		}
		System.out.println();

		int middle = ((s.length() % 2) == 0)?((s.length() / 2 ) - 1):((s.length() - 1 ) / 2); 
		System.out.println("The middle character is" + " " +(s.charAt(middle))); 
	}
}
