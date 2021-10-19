package nestedloop_19_10_2021;

public class N_1_12_123_1234_12345 
{

	public static void main(String[] args)
	{
		N_1_12_123_1234_12345 n = new N_1_12_123_1234_12345();
		//n.num();
		n.num2();
		
	}
	
	
	
	public void num2() 
	{
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(col + " ");
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
			System.out.print(col + " ");
			col++;
		}
		System.out.println();
          row++;
		}
	}

	
	
}

/*
 output:
 
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 

*/
 
