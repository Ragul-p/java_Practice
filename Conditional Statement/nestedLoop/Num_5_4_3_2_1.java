package nestedLoop;

public class Num_5_4_3_2_1
{

	public static void main(String[] args) 
	{
		Num_5_4_3_2_1 n = new Num_5_4_3_2_1();
		//n.num();
		n.num2();
	}

	public void num2() 
	{
		int count=1;
		while(count<=5)
		{
			int no=5;
			while(no>=1)
			{
				System.out.print(no + " ");
				no--;
			}
			System.out.println();
			count++;
		}
		
		/*
		 
		 output :     5 4 3 2 1 
                  5 4 3 2 1 
                  5 4 3 2 1 
                  5 4 3 2 1 
                  5 4 3 2 1 

		 */
	}
	
	
	

	public void num()
	{
		int no=5;
		while(no>=1)
		{
			System.out.print(no + " ");
			no--;
		}
		// output : 5 4 3 2 1 
	}

	
	
	
}
