import java.util.Scanner;

public class Problem22 {
	//this method converts Farenheit to Celsius
	public static double Celsius(double farenheit) {
		double celsius = 5.0/9.0 * (farenheit - 32);
		return celsius;
	}
	
	//This method converts Celsius to Farenheit
	public static double Farenheit(double celsius) {
		double farenheit = 9.0/5.0 * celsius + 32;
		return farenheit;
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		//Prompt the user to enter a temperature in Farenheit
		System.out.print("Enter a temperature in Farenheit: ");
		double userFarenheit = keyboard.nextDouble();
		
		//Output the degrees in celsius
		System.out.printf("%.2f degrees Farenheit = %.2f degrees Celsius\n", userFarenheit, Celsius(userFarenheit));
		
		//Prompt the user to enter a temperature in Celsius
		System.out.print("Enter a temperature in Celsius: ");
		double userCelsius = keyboard.nextDouble();
		
		//Output the degrees in Farenheit
		System.out.printf("%.2f degrees Celsius = %.2f degrees Farenheit\n", userCelsius, Farenheit(userCelsius));
	}

}
