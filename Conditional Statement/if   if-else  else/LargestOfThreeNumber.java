package learnjava;

public class LargestOfThreeNumber 
{

	public static void main(String[] args) 
	{
		
     LargestOfThreeNumber l = new LargestOfThreeNumber();
     l.num();
	}

	public void num() 
	{
		int a=50, b=200 ,c=30;
		
		
		if(a>=b)
		{
		  if(a>=c)
		  {
			  System.out.println("a greater " + a);
		  }
		  else
		  {
			  System.out.println("c greater " + c);
		  }
		}
		
		if(b>=a)
		{
			if(b>=c)
			{
				System.out.println("b greater " + b);
			}
			else
			{
				System.out.println("c greater " + c);
			}
		}
		
	}

}


/*
 
output:-

b greater 200

*/
