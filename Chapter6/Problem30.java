import java.util.Scanner;
import java.util.Random;

public class Problem30 {
	public static void main(String[] args) {
		Random randomNumber = new Random();
		Scanner keyboard = new Scanner(System.in);
		int guess;
		int number;
		String choice;
		
		do {
			number = randomNumber.nextInt(1000) + 1;
			System.out.print("Guess a number between 1 - 1000: ");
			guess = keyboard.nextInt();
			
			while (guess != number) {
				while (guess > number) {
					System.out.println("Too high! Try lower.");
					guess = keyboard.nextInt();
				}
				
				while (guess < number) {
					System.out.println("Too low! Try higher.");
					guess = keyboard.nextInt();
				}
			}
			
			System.out.println("Congratulations! Play again?");
			choice = keyboard.next();
		}
		while (choice.equalsIgnoreCase("yes"));
	}
}
