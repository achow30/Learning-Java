import java.util.Scanner;

public class Problem9 {
	private static int doubleToInteger(double number) {
		int newNumber = (int)(Math.floor(number + .5));
		return newNumber;
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double userInput;
		
		System.out.print("Enter a floating point value: ");
		userInput = keyboard.nextDouble();
		
		System.out.printf("Your number is %f,\n"
				+ "and your new integer value is %d", userInput, doubleToInteger(userInput));
	}

}
