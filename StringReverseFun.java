/*
* A java program that takes user input in the form of a string, and provides 
*and output of that string in the original and reverse order.
* by: jpigg
*/
import java.util.Scanner;

public class StringReverseFun {

	public static void main(String[] args){

		//setup for user input
		Scanner userInput = new Scanner(System.in);

		//getting and storing user input
		System.out.println("Enter String to Reverse:");
		String userString = userInput.nextLine();
		String reverseString = "";

		//outputting user input
		System.out.println("Your string: " + userString);

		//loop that traverses user string from end to start, concatting to an empty string to reverse it
		for (int count = userString.length() ; count > 0 ; count--) {
			reverseString = reverseString + userString.charAt(count - 1);
		}

		//outputting the reversed string
		System.out.println("Reversed string: " + reverseString);
	}

}