class Cyclic 
{
	public static void main(String[] args) 
	{
		int row;
		int line;
		int space;
		for (row = 1;row <= 9 ;row++ )
		{
			for (space = 1;space <= 9-row ;space++ )	System.out.print(" ");
			for (line = 1;line <= 2 * row;line++ )	System.out.print("*");
			System.out.println();
		}
		for (row = 9;row >= 1 ;row-- )
		{
			for (space = 1;space <= 9-row ;space++ )	System.out.print(" ");
			for (line = 1;line <= 2 * row;line++ )	System.out.print("*");
			System.out.println();
		}
		
	}
}
