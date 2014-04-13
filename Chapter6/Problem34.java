
public class Problem34 {
	private static void toBinary(int x) {
		int binary;
		int i;
		
		while (x > 0) {
			binary = x;
			i = 1;
			while (i < x/2) {
				i *= 2;
			}
			
			binary = binary/i;
			System.out.print(binary);
			
			x = x/2;
		}
	}
	
	public static void main(String[] args) {
		toBinary(57);
	}
}
