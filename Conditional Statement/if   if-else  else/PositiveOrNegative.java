package learnjava;

public class PositiveOrNegative 
{

	public static void main(String[] args) 
	{
		PositiveOrNegative pn = new PositiveOrNegative();
		pn.positivenegative();
	}

	private void positivenegative() 
	{
/*
1.get no from user 
2.if no greater than 0 print positive
3.otherwise no less than 0 is negative
4.otherwise you enter zero
 */
		int no = -10;
		
		if(no>0)
		{
			System.out.println("positive");
		}
		else if(no<0)
		{
			System.out.println("negative");
		}
		else
		{
			System.out.println("you enter zero  ");
		}
		
	}

}


/*

output:-

negative

*/

