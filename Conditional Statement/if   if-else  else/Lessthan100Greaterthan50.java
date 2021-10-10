package learnjava;

public class Lessthan100Greaterthan50 
{

	public static void main(String[] args) 
	{
	Lessthan100Greaterthan50 l = new Lessthan100Greaterthan50();
	l.num();

	}

	public void num() 
	{
	 
		int no=80;
		if(no<=100)
		{
			System.out.println("less than 100 : " + no);
			if(no>=50)
			{
				System.out.println("greater than 50 : " + no);
			}
		}
		else
		{
			System.out.println("greater than 100 ");
		}
		
	}

}


/*

output:-

less than 100 : 80
greater than 50 : 80


*/