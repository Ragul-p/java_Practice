package numbers;

public class Number_15_31_63_127_255 
{
	// Logic: (15*2)+1=31, (31*2)+1=63, (63*2)+1=127, (127*2)+1=255

	public static void main(String[] args) 
	{
		Number_15_31_63_127_255 n = new Number_15_31_63_127_255();
		  n.num();
		//n.num2();

	}

	public void num2()
	{
		int no=15;
		
		System.out.println(no); //---no=15
		no=(no*2)+1; //--------------(15*2)+1  no=31
		System.out.println(no); //---no=31
		no=(no*2)+1; //--------------(31*2)+1  no=63
		System.out.println(no); //---no=63
		no=(no*2)+1; //--------------(63*2)+1  no=127
		System.out.println(no); //---no=127
		no=(no*2)+1; //--------------(127*2)+1 no=255
		System.out.println(no); //---no=255
		
	}

	public void num()
	{
		int no=15;
		while(no<=255)
		{
		System.out.println(no);//no=15, no=31,          no=63,           no=127,           no=255
		no=(no*2)+1; //      (15*2)+1  no=31, (31*2)+1  no=63, (63*2)+1  no=127, (127*2)+1 no=255
		}
		
		
	}

}
/*
output:-

15
31
63
127
255

*/
