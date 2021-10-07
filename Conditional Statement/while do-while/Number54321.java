package doWhileWhile;

public class Number54321
{

	public static void main(String[] args)
	{
  Number54321 n = new Number54321();
  n.num();
  n.num2();
  }

	private void num2()
  {
		    int no = 5;
		    do{
			    System.out.print(no+ "  ");
			    no=no-1;   // no=1, no=1+1=2, no=2+1=3, no=3+1=4, no=4+1=5
		    }while(no>=1);//5>5 ,4>5 ,3>5 ,2>5 ,1>5 
		
	}

	public void num() 
	{   
    int no = 5;
		System.out.println(no+ "");
		no=no-1;//no=4
		System.out.println(no+ "");
		no=no-1;//no=3
		System.out.println(no+ "");
		no=no-1;//no=2
		System.out.println(no+ "");
		no=no-1;//no=1
		System.out.println(no+ "");
		
	}
}

/*
 output:-
 
5
4
3
2
1
5  4  3  2  1  

*/
