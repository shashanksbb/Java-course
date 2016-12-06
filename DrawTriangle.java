public class DrawTriangle{

	public static void triangle(int N)
	{
		int row =0;
		int col=0;

		while(row<N)
		{
			row++;
			 col=0;
			while(col<row)
			{
				col++;
				System.out.print("*");
			}
			System.out.println();
		}
	}
public static void main(String [] args){
	triangle(10);
}
}
