package doWhile_While;

public class Number_6_12_18_24_30
{

	public static void main(String[] args) 
	{
		
    Number_6_12_18_24_30 n =new Number_6_12_18_24_30();
    //n.num();
      n.num2();
    }

	public void num2() 
	{

		int no=6;
		do {
	        System.out.println(no + "  ");
	        no=no+6; //no=6, no=6+6 =12, no=12+6 =18, no=18+6 =24, no=24+6 =30
		   }while(no<=30); //1<30, 2<30, 3<30,.....24<30, 25<30
		
	}

	public void num() 
	{
		
		int no=6;
	    System.out.println(no);
	    no=no+6; //no=6+6 =12
	    System.out.println(no);
	    no=no+6; //no=12+6 =18
	    System.out.println(no);
	    no=no+6; //no=18+6 =24
	    System.out.println(no);
	    no=no+6; //no=24+6 =30
	    System.out.println(no);
		
	}

}

/*
 output:-
 
6
12
18
24
30


*/
