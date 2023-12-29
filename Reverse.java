/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String s = args[0]; 
		int count = s.length() - 1;

//print the backward of the string and print it without go down line
		while (count >= 0) {
			System.out.print(s.charAt(count)); 
			count--;
		}

//down line
		System.out.println();

//middle storage the index of the middle of the string and then i use it for an index too
		int middle = ((s.length() % 2) == 0)?((s.length() / 2 ) - 1):((s.length() - 1 ) / 2); 
		System.out.println("The middle character is" + " " +(s.charAt(middle))); 
	}
}
