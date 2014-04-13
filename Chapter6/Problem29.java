import java.util.Random;
import java.util.Scanner;

public class Problem29 {
	private static final Random randomNumber = new Random();
	
	private enum Coin {HEADS, TAILS};
	
	private static Coin flipResult;
	
	private static void flip() {
		int coinToss = 1 + randomNumber.nextInt(2);
		
		if (coinToss == 1) {
			flipResult = Coin.HEADS;
		}
		
		else {
			flipResult = Coin.TAILS;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int headCount = 0;
		int tailCount = 0;
		String choice;
		
		System.out.println("Flip coin? Type yes or no: ");
		choice = keyboard.next();
		
		while (choice.equalsIgnoreCase("yes")) {
			flip();
			if (flipResult == Coin.HEADS) {
				headCount++;
			}
			else {
				tailCount++;
			}
			
			System.out.println("Flip coin? Type yes or no: ");
			choice = keyboard.next();
		}
		
		System.out.printf("\nheads:\t%d\ntails:\t%d\n", headCount, tailCount);
	}
}
