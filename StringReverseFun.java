import java.util.Scanner;

public class StringReverseFun {

	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);

		System.out.println("Enter String to Reverse:");
		String userString = userInput.nextLine();

		System.out.println("Your string: " + userString);
	}

}