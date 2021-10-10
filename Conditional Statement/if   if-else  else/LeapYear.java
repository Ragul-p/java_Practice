package learnjava;

public class LeapYear
{

	public static void main(String[] args)
	{
		LeapYear l = new LeapYear();
		l.num();

	}
	
       //A year is leap, if it is divisible by 4 and 400. But, not by 100.
	
	public void num() 
	{
		int year=2020;
		
		if(((year%4==0) && (year%100 !=0))  || (year%400==0) )
		{
				System.out.println("leap year");
		}
		else
		{
			System.out.println("not leap year");
		}
	}

}


/*

output:-

leap year

*/