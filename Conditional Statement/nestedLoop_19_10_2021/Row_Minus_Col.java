 package nestedloop_19_10_2021;

public class Row_Minus_Col 
{

	public static void main(String[] args)
	{
		
		Row_Minus_Col r = new Row_Minus_Col();
		//r.num();
		r.num2();
	}

	
	public void num2() 
	{
	
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(row-col + " ");
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
			System.out.print(row-col +" ");
			col++;
		}
		row++;
		System.out.println();
		}
		
	}
}

/*
output:

0 
1 0 
2 1 0 
3 2 1 0 
4 3 2 1 0 

*/
