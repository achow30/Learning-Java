
public class Problem24 {
	private static void isMultiple(int x){
		for (int i = 1; i < x; i++) {
			if (x%i == 0) {
				System.out.print(i + "  ");
			}
		}
	}

	private static boolean isPerfect(int x) {
		int perfectTotal = 0;
		for (int i = 1; i < x; i++) {
			if (x%i == 0) {
				perfectTotal += i;
			}
		}
		
		return (perfectTotal == x);
	}
	
	public static void main(String[] args) {
		for (int i = 2; i <= 1000; i++) {
			if (isPerfect(i)) {
				System.out.print(i + " is PERFECT and its multiples are: ");
				isMultiple(i);
				System.out.println();
			}
		}
	}
}
