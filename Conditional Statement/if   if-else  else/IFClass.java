package learnjava;

public class IFClass 
{

	public static void main(String[] args) 
	{
		
		IFClass  f = new IFClass();
		f.ifClass();
	}

	public void ifClass()
	{
/*
1.get no from user
2.if no is 4 go to temple
3.otherwise,if no is 5 go to church
4.otherwise if no is 6 go to mosque
 */
		
		int no = 4;
		if(no==4)
		{
			System.out.println("go to temple");
		}
		
		else if(no==5)
		{
			System.out.println("go to church");
		}
		else if(no==6)
		{
			System.out.println("go to mosque");
		}
		
		
	}
	
	
}

/*
output:-

go to temple
 
 */
