
public class Problem21 {
	private static int integerQuotient(int a, int b) {
		int quotient = a/b;
		
		return quotient;
	}
	
	private static int remainder(int a, int b) {
		int modulum = a%b;
		
		return modulum;
	}
	
	private static void displayDigits(int number) {
		int display;
		for (int i = 10000; i >= 1; i /= 10) {
			display = integerQuotient(number, i);
			number = remainder(number, i);
			
			if (display != 0) {
				System.out.print(display + "  ");
			}
		}
	}
	
	public static void main(String[] args) {
		displayDigits(435);
	}
}
