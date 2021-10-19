package nestedloop_19_10_2021;

public class N_1_23_345_4567_56789 
{

	public static void main(String[] args) 
	{
		N_1_23_345_4567_56789 n = new N_1_23_345_4567_56789();
		n.num();
		//n.num2();
	}

	public void num2() 
	{
		int end=1;
		for(int row=1;row<=5;row++)
		{
			for(int col=row;col<=end;col++)
			{
				System.out.print(col + " ");
			}
			System.out.println();
			end=end+2;
		}
		
		
	}

	public void num()
	{
		
	    int end=1;
		int row=1;
		while(row<=5)
		{
		int col=row;
		while(col<=end)
		{
			System.out.print(col + " ");
			col++;
		}
		System.out.println();
          row++;
          end=end+2;
          
		}
	}

		
}

/*
 
output:

1 
2 3 
3 4 5 
4 5 6 7 
5 6 7 8 9 

*/
