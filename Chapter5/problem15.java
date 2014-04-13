
public class problem15 {
	public static void main(String[] args) {
		
		for (int i = 9; i > 0; i--) {
			for (int k = 1; k <= (9-i); k++) {
				System.out.print(" ");
			}
			
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for (int m = 1; m < 10; m++) {
			for (int n = 1; n <= (9-m); n++) {
				System.out.print(" ");
			}
			for (int o = 1; o <= m; o++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
}
