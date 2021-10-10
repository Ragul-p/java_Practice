package learnjava;

public class Grade
{

	public static void main(String[] args)
	{
		Grade g = new Grade();
		g.grade();

	}

	private void grade()
	{
		
/*
1.get mark from user
2.if mark is greater than 90 you got A grade
3.otherwise mark is greater than 80 you got B grade
4.otherwise mark is greater than 70 you got C grade
5.otherwise study well
 */
		int mark = 80;
		if(mark>=90)
		{
			System.out.println("A grade");
		}
		else if(mark>=80)
		{
			System.out.println("B grade");
		}
		else if(mark >=60)
		{
			System.out.println("C grade");
		}
		else 
		{
			System.out.println("you can study well");
		}
	}

}

/*

output:-

B grade

*/

