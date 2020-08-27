import java.util.Scanner;

public class StringReverseFun {

	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);

		System.out.println("Enter String to Reverse:");
		String userString = userInput.nextLine();
		String reverseString = "";

		System.out.println("Your string: " + userString);

		for (int count = userString.length() ; count > 0 ; count--) {
			reverseString = reverseString + userString.charAt(count - 1);
		}

		System.out.println("Reversed string: " + reverseString);
	}

}