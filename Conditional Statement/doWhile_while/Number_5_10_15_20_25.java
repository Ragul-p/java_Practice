package doWhile_While;


public class Number_5_10_15_20_25
{

	public static void main(String[] args)
	{
		Number_5_10_15_20_25 n = new Number_5_10_15_20_25();
		//n.num();
		  n.num2();
    }

	public void num2() 
	{ 
		int no = 5;
	    do {
	        System.out.println(no + "  ");
	        no=no+5; // no=5, no=5+5=10, no=10+5=15, no=15+5=20, no=20+5=25, no=25+5=30
	       }while(no<=30); //5<30, 6<30, 7<30, 8<30, 9<30, 10<30,....., 29<30, 30<30. 
	}

	public void num()
	   {   
		
		int no = 5;
		System.out.println(no);
		no=no+5;//no=5+5 =10
		System.out.println(no);
		no=no+5;//no=10+5 =15
		System.out.println(no);
		no=no+5;//no=15+5 =20
		System.out.println(no);
		no=no+5;//no=20+5 =25
		System.out.println(no);
		no=no+5;//no=25+5 =30
		System.out.println(no);
		
	   }

}

/*
output:-

5
10
15
20
25
30


*/