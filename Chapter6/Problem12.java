import java.util.Random;

public class Problem12 {

	public static void main(String[] args) {
		Random random = new Random();
		// TODO Auto-generated method stub
		int a;
		int b;
		int c;
		
		for (int i = 1; i <= 100; i++) {
			a = 2 + random.nextInt(5) * 2;
			b = 3 + random.nextInt(5) * 2;
			c = random.nextInt(5)*4 + 6;
			
			System.out.print(c + " ");
			
			if (i%20 == 0)
				System.out.println();
		}

	}

}
