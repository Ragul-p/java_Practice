package nestedloop_19_10_2021;

public class N_1_23_456_78910_1112131415
{

	public static void main(String[] args) 
	{
		N_1_23_456_78910_1112131415 n = new N_1_23_456_78910_1112131415();
		//n.num();
		n.num2();
	}

	public void num2() 
	{
		int i=1;
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(i + " ");
				i=i+1;
			}
			System.out.println();
		}
		
		
		
	}

	public void num()
	{
		int i=1;
		int row=1;
		while(row<=5)
		{
		int col=1;
		while(col<=row)
		{
			System.out.print(i + " ");
			i=i+1;
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
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 

*/
