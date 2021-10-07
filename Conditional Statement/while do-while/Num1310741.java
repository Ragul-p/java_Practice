package doWhileWhile;

public class Num1310741
{

	public static void main(String[] args) 
	{
		Num1310741 n = new Num1310741();
		n.num();
		n.num2();
	}

	private void num2() 
	{
		int no = 13;
		do {
		   System.out.print(no +"  ");
		   no=no-3; //no=13, no=13-3=10, no=10-3=7, no=7-3=4, no=4-3=1
		   }while(no>=1); //1<13, 2<13, 3<13, 4<13, 5<13,....., 13<13.
  }

	private void num()
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
13  10  7  4  1  

*/
