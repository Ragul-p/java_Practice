package doWhile_While;

public class Number_5_4_3_2_1
{


	public static void main(String[] args)
	{
     Number_5_4_3_2_1 n = new Number_5_4_3_2_1();
    // n.num();
       n.num2();
    }

	private void num2() 
	   {
		    int no = 5;
		    do{
			   System.out.println(no+ "  ");
			   no=no-1;      // no=1, no=1+1=2, no=2+1=3, no=3+1=4, no=4+1=5
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


*/