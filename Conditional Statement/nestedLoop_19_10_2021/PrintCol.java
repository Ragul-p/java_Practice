package nestedloop_19_10_2021;

public class PrintCol {

	public static void main(String[] args) 
	{
		   PrintCol p =new PrintCol();
		   //p.num();
		   p.num2();
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
			System.out.print(col +" ");
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
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 

*/
