package numbers;

public class Number_13_25_51_101_203 
{
	//logic: (13*2)-1=25, (25*2)+1, (51*2)-1=101, (101*2)+1=203 

	public static void main(String[] args)
	{
		Number_13_25_51_101_203 n = new Number_13_25_51_101_203();
		//n.num();
		n.num2();

	}

	public void num2() 
	{
		int no=13;
		while(no<=203)
		{
			
		System.out.println(no);
		no=(no*2)-1;
		if(no>204) { break; }
		System.out.println(no);
		no=(no*2)+1;
		}
				
	}

	public void num()
	{
		int no=13;
		System.out.println(no);
		no=(no*2)-1;
		System.out.println(no);
		no=(no*2)+1;
		System.out.println(no);
		no=(no*2)-1;
		System.out.println(no);
		no=(no*2)+1;
		System.out.println(no);
		
		
		
	}

}

/*
 output:-
 
13
25
51
101
203

*/
