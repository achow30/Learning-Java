
public class Problem26 {
	private static int gcd(int x, int y) {
		int a = Math.max(x, y);
		int b = Math.min(x, y);
		int remainder = a%b;
		
		while (remainder > 0) {
			a = b;
			b = remainder;
			
			remainder = a%b;
		}
		
		return b;
	}
	
	public static void main(String[] args) {
		System.out.println(gcd(35, 6));
		System.out.println(gcd(6, 35));
		
		System.out.println(gcd(1071, 462));
		System.out.println(gcd(462, 1071));
	}
}
