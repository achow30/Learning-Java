import java.util.Scanner;

public class Problem10 {
	private static void roundToInteger(double number) {
		int newInteger = (int)(Math.floor(number + 0.5));
		System.out.printf("Your number was %f,\n"
				+ "and your new integer value is %d.\n", number, newInteger);
	}
	
	private static void roundToTenths(double number) {
		double newTenths = (Math.floor(number*10 + 0.5))/10;
		System.out.printf("Your number was %f,\n"
				+ "and your new rounded value is %f.\n", number, newTenths);
	}
	
	private static void roundToHundredths(double number) {
		double newHundredths = (Math.floor(number*100 + 0.5))/100;
		System.out.printf("Your number was %f,\n"
				+ "and your new rounded value is %f.\n", number, newHundredths);
	}
	
	private static void roundToThousandths(double number) {
		double newThousandths = (Math.floor(number*1000 + 0.5))/1000;
		System.out.printf("Your number was %f,\n"
				+ "and your new rounded value is %f.\n", number, newThousandths);
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double userInput;
		
		System.out.print("Enter a floating point decimal: ");
		userInput = keyboard.nextDouble();
		
		roundToInteger(userInput);
		roundToTenths(userInput);
		roundToHundredths(userInput);
		roundToThousandths(userInput);
		
	}

}
