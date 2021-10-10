package learnjava;

public class IFClass2 
{

	public static void main(String[] args)
	{
		IFClass2 i =new IFClass2();
		i.day();

	}

	private void day()
	{
		
/*
1.get day from user
2.if day is 4 and time is nine go to temple 
3.otherwise go to office
4.else if day is 5 and time is 9 go to church
5.otherwise go to office
6.else if day is 6 and time is 9 go to moaque
7.otherwise go to office
 */
		int day = 6;
		int time=9;
		if(day==4)
		{
			if(time==9)
			{
				System.out.println("go to temple");
			}
			else
			{
				System.out.println("go to office ");
			}
		}
		else if(day==5)
		{
			if(time==9)
			{
				System.out.println("go to church");
			}
			else
			{
				System.out.println("go to office ");
			}
		}
		
		else if(day==6)
		{
			if(time==9)
			{
				System.out.println("go to mosque");
			}
			else
			{
				System.out.println("go to office ");
			}
		}
	}

}

/*
output:-

go to mosque

*/
