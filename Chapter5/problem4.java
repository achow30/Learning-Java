
public class problem4 {
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1; i < 100; i++) {
			if (i%2 == 1) {
				sum += i;
			}
		}
		
		double powEr = Math.pow(2.5, 3);
		
		for (int i = 1; i <= 20; i++) {
			System.out.print(i);
			
			if (i%5 == 0) {
				System.out.println();
			} else {
				System.out.print("\t");
			}
		}
		
		int j = 1;
		
		while (j <= 20) {
			System.out.print(j);
			
			if (j%5 == 0) {
				System.out.println();
			} else {
				System.out.print("\t");
			}
			
			j++;
		}
	}

}
