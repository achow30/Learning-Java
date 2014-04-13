import java.util.Scanner;

public class Problem14 {
	public static int integerPower(int base, int exponent) {
		int power = 1;
		for (int i = 1; i <= exponent; i++) {
			power *= base;
		}
		
		return power;
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a base and its exponent, separated by a space: ");
		int userBase = keyboard.nextInt();
		int userExponent = keyboard.nextInt();
		
		System.out.printf("%d to the %dth power is %d\n", userBase, userExponent, integerPower(userBase, userExponent));
	}
}
