
public class Problem20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] sales = {{40, 50, 32, 20}, {31, 78, 92, 41}, {12, 18, 7, 9}, {50, 50, 50, 51},
				{60, 50, 70, 55}};
		int itemTotal;
		int personTotal = 0;
		
		System.out.printf("%s%6d%6d%6d%6d%7s\n", "Person#", 1, 2, 3, 4, "total");
		System.out.println("Product");
		
		for (int row = 0; row < sales.length; row++) {
			System.out.print(row+1);
			itemTotal = 0;
			
			for (int col = 0; col < sales[row].length; col++) {
				itemTotal += sales[row][col];
				
				if (col == 0) {
					System.out.printf("%11d", sales[row][col]);
				}
				else {
					System.out.printf("%6d", sales[row][col]);
				}
			}
			
			System.out.printf("%7d", itemTotal);
			System.out.println();
		}
		
		System.out.print("Total:");
		
		for (int col = 0; col < 4; col++) {
			personTotal = 0;
			
			for (int row = 0; row < sales.length; row++) {
				personTotal += sales[row][col];
			}
			
			System.out.printf("%6d", personTotal);
		}
	}

}
