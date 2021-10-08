package doWhile_While;

public class Number_1_3_5_7_9
{

	public static void main(String[] args)
	{
		
	  Number_1_3_5_7_9 n =new Number_1_3_5_7_9();
	  //n.num();
	    n.num2();
	}

	public void num2() 
	   {
		  int no = 1;
		  do {
		      System.out.println(no +"  ");
		      no=no+2; //1, 1+2=3, 3+2=5, 5+2=7, 7+2=9
		     }while(no<=10);//1<10, 2<10, 3<10, 4<10, 5<10, 6<10, 7<10, 8<10, 9<10, 10<10
	  }

	public void num() 
	  {  
		
		int no = 1;
		System.out.println(no);
		no=no+2;//1+2=3
		System.out.println(no);
		no=no+2;//3+2=5
		System.out.println(no);
		no=no+2;//5+2=7
		System.out.println(no);
		no=no+2;//7+2=9
		System.out.println(no);
		no=no+2;
	
	 }

}

/*
  output:-
1
3
5
7
9

*/
