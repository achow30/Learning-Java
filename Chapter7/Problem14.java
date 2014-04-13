import java.util.Scanner;

public class Problem14 {
	private static int product(int[] list) {
		int total = 1;
		
		for (int i = 0; i < list.length; i++) {
			total *= list[i];
		}
		
		return total;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {8, 7, 1, 5};
		
		System.out.println(product(array));
	}

}
