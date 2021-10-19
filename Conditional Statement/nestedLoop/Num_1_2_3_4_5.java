package nestedLoop;

public class Num_1_2_3_4_5
{

	public static void main(String[] args) 
	{
		Num_1_2_3_4_5 n = new Num_1_2_3_4_5();
		//n.num();
		n.num2();
	}

	
	
	
	public void num2() 
	{
		int count=1;
		while(count<=5)
		{
			int no=1;
			while(no<=5)
			{
			 System.out.print(no +" ");
			 no++;
			}
		System.out.println();
		count++;
		}
		
		
		/*
		 output :      1 2 3 4 5 
                   1 2 3 4 5 
                   1 2 3 4 5 
                   1 2 3 4 5 
                   1 2 3 4 5 
		 */
		
	}
	
	
	

	public void num() 
	{
		int no=1;
		while(no<=5)
		{
			System.out.print(no +" ");
			no++;
		}
		
		// output : 1 2 3 4 5 
	}

	
	
	
}
