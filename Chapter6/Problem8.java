import java.util.Scanner;

public class Problem8 {
	private static double receipt = 0;
	
	private static double calculateCharges(double hoursParked) {
		double charges;
		
		if (hoursParked <= 3.0) {
			charges = 2.00;
		}
		else {
			charges = (Math.ceil(hoursParked - 3.0)) * 0.50 + 2.00;
			
			if (charges >= 10.00) {
				charges = 10.00;
			}
		}
		
		return charges;
	}
	
	private static void displayReceipt(){
		System.out.printf("\nThe total value of yesterday's receipts is $%.2f\n", receipt);
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double customerHours;
		
		do {
			System.out.print("Enter the hours that you parked (Enter a negative number to stop the program): ");
			customerHours = keyboard.nextDouble();
			
			if (customerHours < 0) {
				continue;
			}
			
			System.out.printf("You parked for %.2f hours\n"
					+ "and your total cost is: $%.2f.\n\n", customerHours, calculateCharges(customerHours));
			
			receipt += calculateCharges(customerHours);
		} 
		while (customerHours >= 0);

		displayReceipt();
	}

}
