
public class Problem13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] sales = new int[3][5];
		
		for ( int row = 0; row < sales.length; row++ )
		{
			for ( int col = 0; col < sales[ row ].length; col++ )
			{
				sales[ row ][ col ] = 0;
				
				System.out.print((row+1) + "-" + (col+1) + " ");
			}
			System.out.println();
		}
	}

}
