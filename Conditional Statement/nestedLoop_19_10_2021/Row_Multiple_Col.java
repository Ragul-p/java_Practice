package nestedloop_19_10_2021;

public class Row_Multiple_col
{

	public static void main(String[] args)
	{
		Row_Multiple_col r = new Row_Multiple_col();
		//r.num();
		r.num2();

	}

	public void num2() 
	{
	
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(row*col + " ");
			}
			System.out.println();
		}
		
	}

	public void num()
	{
	
		int row=1;
		while(row<=5)
		{
		int col=1;
		while(col<=row)
		{
			System.out.print(row*col + " ");
			col++;
		}
		row++;
		System.out.println();
		}
		
	}

}

/*
 output:
 
1 
2 4 
3 6 9 
4 8 12 16 
5 10 15 20 25 

*/
