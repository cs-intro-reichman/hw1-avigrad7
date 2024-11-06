// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int input = Integer.parseInt(args[0]);
		int ones = input % 10;
		input /= 10;
		int tens = input % 10;
		int hundreds = input / 10;
		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
	}
}
