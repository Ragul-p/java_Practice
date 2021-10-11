package numbers;

public class Number_165_195_255_285_345
{
   // 165+30=195, 195+60=255, 255+30=285, 285+60=345
	public static void main(String[] args)
	{
		Number_165_195_255_285_345 n =new Number_165_195_255_285_345();
		//n.num();
		n.num2();

	}

	public void num2()
	{
		int no=165;
		while(no<=345)
		{
	System.out.println(no);
	no=no+30;
	if(no>345) {break;}
	System.out.println(no);
	no=no+60;
		}
		
		
	}

	public void num()
	{
		int no=165;
	System.out.println(no);
	no=no+30;
	System.out.println(no);
	no=no+60;
	System.out.println(no);
	no=no+30;
	System.out.println(no);
	no=no+60;
	System.out.println(no);
		
	}

}

/*
 output:-
 
165
195
255
285
345

*/
