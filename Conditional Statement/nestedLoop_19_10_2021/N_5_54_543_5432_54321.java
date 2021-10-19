package nestedloop_19_10_2021;

public class N_5_54_543_5432_54321 
{

	public static void main(String[] args) 
	{
		N_5_54_543_5432_54321 n =new N_5_54_543_5432_54321();
		//n.num();
		n.num2();
		
	}



	public void num2() 
	{
	
		for(int row=5;row>=1;row--)
		{
			for(int col=5;col>=row;col--)
			{
				System.out.print(col +" ");
			}
			System.out.println();
		}
		
	}

	
	
	public void num() 
	{
		
		int row=5;
		while(row>=1)
		{
		int col=5;
		while(col>=row)
		{
			System.out.print(col + " ");
			col--;
		}
		row--;
		System.out.println();
		}
	}

}

/*

output:

5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1 

*/
