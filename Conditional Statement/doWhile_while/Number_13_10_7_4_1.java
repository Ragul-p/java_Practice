package doWhile_While;

public class Number_13_10_7_4_1
{

	public static void main(String[] args) 
	{
		Number_13_10_7_4_1 n = new Number_13_10_7_4_1();
		//n.num();
		  n.num2();
	}

	public void num2() 
	{
		int no = 13;
		do {
		   System.out.println(no +"  ");
		   no=no-3;       //no=13, no=13-3=10, no=10-3=7, no=7-3=4, no=4-3=1
		   }while(no>=1); //1<13, 2<13, 3<13, 4<13, 5<13,....., 13<13.
		
	}

	public void num()
	  {
		
	   int no = 13;
	   System.out.println(no);
	   no=no-3;//no=13-3=10
	   System.out.println(no);
	   no=no-3;//no=10-3=7
	   System.out.println(no);
	   no=no-3;//no=7-3=4
	   System.out.println(no);
	   no=no-3;//no=4-3=1
	   System.out.println(no);
	 
	  }

}
/*
 output:-
 
13
10
7
4
1


*/