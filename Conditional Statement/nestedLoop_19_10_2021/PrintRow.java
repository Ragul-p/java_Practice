package nestedloop_19_10_2021;

public class PrintRow 
{

	public static void main(String[] args)
	{
		
      PrintRow p =new PrintRow();
     // p.num();
      p.num2();
	}

	
	public void num2() 
	{
	
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(row + " ");
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
			System.out.print(row + " ");
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
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 

*/
