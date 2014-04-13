
public class Problem25 {
	private static boolean isPrime(double x) {
		int primeTotal = 0;
		for (int i = 1; i <= Math.sqrt(x); i++) {
			if (x%i == 0) {
				primeTotal += i;
			}
		}
		
		return (primeTotal <= 1);
	}
	
	public static void main(String[] args) {
		for (int i = 1; i < 10000; i++) {
			if (isPrime(i)) {
				System.out.print(i + "  ");
			}
			if (i%20 == 0) {
				System.out.println();
			}
		}
	}
}
