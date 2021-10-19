package nestedLoop;

public class N_54321_5432_543_54_5
{

	public static void main(String[] args) 
	{
	N_54321_5432_543_54_5 n = new N_54321_5432_543_54_5();
	//n.num();
	n.num2();
	}

	
	
	public void num2()
	{
		int row=1;
		while(row<=5)
		{
		int col=5;
		while(col>=row)
		{
			System.out.print(col + " ");
			col--;
		}
		System.out.println();
		row++;
		}
		
/*		
output :

		5 4 3 2 1 
		5 4 3 2 
		5 4 3 
		5 4 
		5 
		
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
		System.out.println(); //------------------54321
		
	    no=5;
		while(no>=2)
		{
			System.out.print(no + " ");
			no--;
		}
		System.out.println(); //------------------5432
		
		no=5;
		while(no>=3)
		{
			System.out.print(no + " ");
			no--;
		}
		System.out.println(); //------------------543
		
		no=5;
		while(no>=4)
		{
			System.out.print(no + " ");
			no--;
		}
		System.out.println(); //------------------54
		
		no=5;
		while(no>=5)
		{
			System.out.print(no + " ");
			no--;
		}
		System.out.println(); //------------------5
		
		
	}

}
