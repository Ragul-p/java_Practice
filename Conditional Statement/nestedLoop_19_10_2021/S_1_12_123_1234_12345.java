package nestedloop_19_10_2021;

public class S_1_12_1234_12345
{

	public static void main(String[] args) 
	{
		S_1_12_1234_12345 s = new S_1_12_1234_12345();
		//s.num();
		s.num2();
	}

	public void num2() 
	{
	
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print("* ");
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
			System.out.print("* ");
			col++;
		}
		row++;
		System.out.println();
		}
		
	}

}

/*
output:

* 
* * 
* * * 
* * * * 
* * * * * 


*/
